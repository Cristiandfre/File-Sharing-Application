# 📂 Distributed File-Sharing Application  

## 🚀 Description  
This program implements a distributed file-sharing system using **multithreading, TCP, and multicast** to facilitate file transfers between clients in a shared network.  

## 🛠️ Features  
- 📡 **Multithreading** to handle multiple transfers simultaneously.  
- 🔗 **TCP** ensures reliable communication between clients and the server.  
- 🌐 **Multicast** enables messaging among nodes.  

## 📌 Technologies Used  
- **Java** (Core Java)  
- **TCP sockets** for file transmission.  
- **Multicast** for group communication.

## 🖥️ Running the Project in NetBeans  

This project was developed using **NetBeans**, and it is recommended to use NetBeans for compilation and execution.  

### Steps to Run in NetBeans:  
1. Open **NetBeans IDE**.  
2. Click File → Open Project and select either the client or server folder, depending on what you want to execute.
3. Press **F6** or click **Run Project** to compile and execute automatically.  
4. NetBeans will handle all dependencies and execution paths, ensuring smooth operation.  

If you prefer using the command line, you can manually compile and run it using `javac` and `java`, but NetBeans simplifies the process significantly.

## ⚠️ Important Notice  

Currently, this application is optimized for **small file transfers**. Large file transfers may encounter issues due to the lack of a **buffering mechanism**.  

📌 **Limitations:**  
- The program is designed for small files, and sending large files may cause errors or instability. 
- A buffer implementation is **pending**, which will allow efficient handling of larger files.  
- Until the buffer mechanism is integrated, **transferring large files may fail or cause instability**.  

🚀 **Upcoming Improvement:**  
An enhanced **buffering system** is planned to support large file transfers and ensure stability across different network conditions. 

