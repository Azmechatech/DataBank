# DataBank 
DataBank Concept, Libraries and utilities

This project is an attempt to promote decentralization of data while protecting the interests of individuals and organizations. While the data is 21st century Gold, it must not be limited to stay in databases and data-lakes of one organization as it is generated from the society. There needs to be way to protect the interests or individuals and organizations, and at same time it should be available to researchers and professionals to generate more value out of it for society.

By design the library and processes incorporated in this project will protect the sensitive information, and will only expose the data on which Statistics Models and AI/ML can be built. But the individual or organization will only be able to use the model for practical purposes if the original owner of the data discloses the [Account Key](https://github.com/Azmechatech/DataBank/tree/master/AccountKeys) that is generated when the data is encoded with help of [DataEncoder.ipynb](https://github.com/Azmechatech/DataBank/blob/master/jpynb/DataEncoder.ipynb) located in [jpynb](https://github.com/Azmechatech/DataBank/tree/master/jpynb) folder of this project.

The third-party can be of following types:
1. Researchers looking for context independent data set,
2. Researchers looking for context dependent data set,
3. Professionals/Consulting firms wanting to prove their expertise on your data set by building POC models,
4. Professionals/Consulting firms employed by you but they are building models out side your IT infrastructure.

Strategy for sharing data with "Researchers looking for context independent data set" is to make the folder/directory [Bank/accountAAA/](https://github.com/Azmechatech/DataBank/tree/master/Bank/account1) available on Github or any other public location on internet you own. For "Researchers looking for context dependent data set" one must approach you with a formal email. You must verify the authenticity of the researcher. Once verified the authenticity share the [accountAAA_sampleData1-CoMap.json](https://github.com/Azmechatech/DataBank/blob/master/AccountKeys/account1_sampleData1-CoMap.json) file located in [AccountKeys](https://github.com/Azmechatech/DataBank/tree/master/AccountKeys) folder. This will add some context to the data , but will not give out essential information that could be used to take business or personal advantage of the information without your permission. 

For "Professionals/Consulting firms wanting to prove their expertise on your data set by building POC models" and , they will usually need larger volume of data. A larger volume of data would mean larger information attached to it. You will really need to figure out how much of it needs to be shared. No matter how much you trust the third party have legal agreements in place, even when you are sharing the encoded data. It can be used by third party by enriching data from the competitions. This can be prevented if you do not share [accountAAA_sampleData1-CoMap.json](https://github.com/Azmechatech/DataBank/blob/master/AccountKeys/account1_sampleData1-CoMap.json). That is, you can share large volume of encoded data without disclosing [accountAAA_sampleData1-CoMap.json](https://github.com/Azmechatech/DataBank/blob/master/AccountKeys/account1_sampleData1-CoMap.json). It is preferred to share the data with controlled set via [Data Streaming Server](https://github.com/Azmechatech/DataBank/tree/master/DataServer/Server) which is already available as part of this library.
And in case of "Professionals/Consulting firms employed by you but they are building models out side your IT infrastructure", data and information no more than "Professionals/Consulting firms wanting to prove their expertise on your data set by building POC models" should be shared. You might want to share different sets of data, but the data volume shouldn't be any more than "Professionals/Consulting firms wanting to prove their expertise on your data set by building POC models".

Image below displays the preferred architecture for sharing data between your organization and consulting firms. The responsibility of serving data stream can be part of your Data Engineering team.

![Architecture](docs/images/DataBank.png)

![Storage Connectors](docs/images/DataBankDataStore.png)
