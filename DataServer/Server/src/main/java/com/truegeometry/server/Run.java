/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truegeometry.server;

import java.io.FileInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import org.rapidoid.job.Jobs;
import org.rapidoid.setup.On;

/**
 * http://localhost:8080/DataBank?account=account1&dataName=sampleData1&type=csv
 * 
 * Use below pattern for serving large files.
 * http://localhost:8080/DataBankStream?account=account1&dataName=sampleData1&type=csv
 * @author Manoj
 */
public class Run {
    
    public static void main(String... args){
        On.get("/DataBank").json((String account, String dataName,String type) ->Handler.getBankData(account, dataName, type));
        
         On.get("/DataBankStream").plain((req, resp) -> {

                        req.async(); // mark asynchronous request processing
                        Path pp = FileSystems.getDefault().getPath("../", "../","Bank",req.params().get("account"),req.params().get("dataName")+"."+req.params().get("type"));
                        final int BUFFER_SIZE = 1024; //this is actually bytes

                        FileInputStream fis = new FileInputStream(pp.toFile());
                        byte[] buffer = new byte[BUFFER_SIZE]; 
                        int read = 0;
                        while( ( read = fis.read( buffer ) ) > 0 ){
                            // call your other methodes here...
                            resp.chunk(buffer);
                        }

                        fis.close();
                        resp.done();
                        

//                        // send part 1
//                        resp.chunk("part 1".getBytes());
//
//                        // after some time, send part 2 and finish
//                        Jobs.after(100).milliseconds(() -> {
//                                resp.chunk(" & part 2".getBytes());
//                                resp.done();
//                        });

                        return resp;
                });
         
    }
}
