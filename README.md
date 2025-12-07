## 🧾 Sample Test Execution Report
Below is the TestNG HTML report generated after the latest execution:

<img width="693" height="515" alt="emailable-report" src="https://github.com/user-attachments/assets/4810c265-694d-4652-9d02-0a278e54200f" />
---

# 🧪 Amazon UI Testing Automation Framework    

A complete **Selenium + Cucumber (BDD)** automation framework built using **Java** and **Maven** to test **Amazon’s Search Functionality**.  
This framework follows the **Page Object Model (POM)** design pattern for clean, maintainable, and scalable test automation.  

---
  
## 🚀 Features  
✅ End-to-End Amazon Search UI Automation  
✅ Behavior-Driven Development (BDD) with **Cucumber**  
✅ Page Object Model (POM) for reusability  
✅ Integrated with **TestNG** and **Maven**  
✅ Generates detailed **HTML Test Reports**   
✅ Cross-browser compatibility (Chrome, Edge, Firefox)  
✅ Easy configuration and modular design  

---

## 🧠 Project Highlights  
- Automated **Amazon Search** functionality  
- Implemented **Page Object Model (POM)** for better maintainability  
- Used **Cucumber + Selenium WebDriver** for BDD-style testing  
- Managed dependencies and build using **Maven**  
- Created **TestNG HTML Reports** for results visualization  

---

## ⚙️ Tools & Technologies  
| Category | Tools |
|-----------|-------|
| **Language** | Java (JDK 21) |
| **Automation Tool** | Selenium WebDriver |
| **Framework** | Cucumber (BDD) |
| **Build Tool** | Maven |
| **Testing** | TestNG |
| **Design Pattern** | Page Object Model (POM) |
| **IDE** | Eclipse / IntelliJ |
| **Version Control** | Git + GitHub |

---

## 🧩 Project Structure  

amazon-ui-test/
│
├── src/
│ ├── main/java/com/amazon/pages/ # Page Object classes
│ ├── test/java/com/amazon/stepdefinitions/ # Step definitions
│ ├── test/java/com/amazon/runners/ # TestRunner class
│ └── test/resources/features/ # Feature files
│
├── test-output/ # HTML and TestNG reports
├── pom.xml # Maven dependencies and build
├── README.md
└── .gitignore

---

## ▶️ How to Run the Tests  


2️⃣ Open the project in Eclipse or IntelliJ IDEA
3️⃣ Install dependencies: mvn clean install
4️⃣ Run the TestRunner class:
Located in src/test/java/com/amazon/runners/TestRunner.java
5️⃣ View reports:
Check the test-output folder for HTML reports after execution
📊 Sample Report Output

✅ TestNG HTML Report:
Displays detailed pass/fail statistics with execution time and step-level logs.

✅ Cucumber Report:
Readable BDD-style summary of test scenarios and steps.

🧠 Future Enhancements

Integrate with Jenkins CI/CD

Add Allure Reports

Extend support for Mobile Testing (Appium)

Integrate with Dockerized Selenium Grid

💡 Author
👨‍💻 Olena
📍 Kyiv
🔗 GitHub: eniroline

🏷️ Keywords
selenium cucumber-bdd java maven testng qa automation amazon-ui pom

---
## 🧪 Test Reports & Logs
This project generates automated HTML reports for every test execution.

![Sample Test Report](./test-output/emailable-report.html)

