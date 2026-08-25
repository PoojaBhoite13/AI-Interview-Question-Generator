\# 🤖 AI Interview Question Generator



An AI-powered interview question generator developed using \*\*Java, Spring Boot, REST API, and Google Gemini API\*\*. The application generates customized interview questions based on the selected technology, experience level, and number of questions.



This project is designed to help students, freshers, and developers prepare for technical interviews efficiently using Generative AI.



\---



\## 📌 Project Overview



The \*\*AI Interview Question Generator\*\* allows users to generate interview questions according to their requirements.



Users can provide:



\* 💻 Technology / Programming Language

\* 🎯 Experience Level

\* 🔢 Number of Questions



The application sends the request to the Spring Boot backend, which communicates with the \*\*Google Gemini API\*\* to generate relevant interview questions and returns the generated response to the user.



\---



\## ✨ Features



\* 🤖 AI-powered interview question generation

\* 💻 Generate questions for different technologies

\* 🎯 Select experience level

\* 🔢 Specify the number of questions

\* 🔗 REST API integration

\* 🧠 Google Gemini API integration

\* ⚡ Fast AI-generated responses

\* ✅ Input validation

\* ❌ Error handling

\* 📱 User-friendly interface

\* 🔐 API key configuration using environment variables



\---



\## 🛠️ Technologies Used



| Technology        | Purpose                           |

| ----------------- | --------------------------------- |

| Java              | Backend programming               |

| Spring Boot       | Backend framework                 |

| REST API          | Client-server communication       |

| Google Gemini API | AI question generation            |

| Maven             | Project and dependency management |

| JSON              | Data exchange format              |

| Postman           | API testing                       |

| Git               | Version control                   |

| GitHub            | Source code management            |



\---



\## 🏗️ Project Architecture



```text

&#x20;                  ┌─────────────────────┐

&#x20;                  │        User         │

&#x20;                  └──────────┬──────────┘

&#x20;                             │

&#x20;                             ▼

&#x20;                  ┌─────────────────────┐

&#x20;                  │   Application UI   │

&#x20;                  └──────────┬──────────┘

&#x20;                             │

&#x20;                             │ HTTP Request

&#x20;                             ▼

&#x20;                  ┌─────────────────────┐

&#x20;                  │    Spring Boot      │

&#x20;                  │      Backend        │

&#x20;                  └──────────┬──────────┘

&#x20;                             │

&#x20;                             │ API Request

&#x20;                             ▼

&#x20;                  ┌─────────────────────┐

&#x20;                  │   Gemini API        │

&#x20;                  │  Generative AI      │

&#x20;                  └──────────┬──────────┘

&#x20;                             │

&#x20;                             │ AI Response

&#x20;                             ▼

&#x20;                  ┌─────────────────────┐

&#x20;                  │    Spring Boot      │

&#x20;                  │      Backend        │

&#x20;                  └──────────┬──────────┘

&#x20;                             │

&#x20;                             │ JSON Response

&#x20;                             ▼

&#x20;                  ┌─────────────────────┐

&#x20;                  │        User         │

&#x20;                  └─────────────────────┘

```



\---



\## 📂 Project Structure



```text

AI-Interview-Question-Generator/

│

├── src/

│   ├── main/

│   │   ├── java/

│   │   │   └── ...

│   │   └── resources/

│   │       └── application.properties

│   │

│   └── test/

│

├── pom.xml

├── .gitignore

└── README.md

```



\---



\## 🔄 How the Application Works



\### Step 1 — User Input



The user provides the required interview details, such as:



```text

Technology: Java

Experience Level: Fresher

Number of Questions: 10

```



\### Step 2 — REST API Request



The application sends the selected information to the Spring Boot backend.



\### Step 3 — Backend Processing



Spring Boot receives the request and creates an appropriate prompt for the Gemini API.



\### Step 4 — Gemini API



The prompt is sent to the Google Gemini API.



Gemini processes the prompt and generates relevant interview questions.



\### Step 5 — Response



The generated questions are returned to the Spring Boot application.



\### Step 6 — Display



The application displays the generated questions to the user.



\---



\## 🚀 Getting Started



Follow the steps below to run the project locally.



\### Prerequisites



Make sure the following software is installed:



\* Java JDK

\* Maven

\* Git

\* IntelliJ IDEA or another Java IDE

\* Postman (optional, for API testing)

\* Google Gemini API Key



\---



\## 📥 Clone the Repository



```bash

git clone https://github.com/YOUR\_USERNAME/AI-Interview-Question-Generator.git

```



Move into the project directory:



```bash

cd AI-Interview-Question-Generator

```



\---



\## 🔑 Configure Gemini API Key



For security, \*\*do not hard-code your Gemini API key\*\* in the source code or upload it to GitHub.



Use an environment variable.



For example, your `application.properties` can use:



```properties

gemini.api.key=${GEMINI\_API\_KEY}

```



Then configure the environment variable on your local computer:



```text

GEMINI\_API\_KEY=your\_actual\_api\_key

```



> ⚠️ Never commit your actual API key to GitHub.



\---



\## ▶️ Run the Application



Open the project in IntelliJ IDEA.



Make sure Maven dependencies are downloaded.



You can also run the application using Maven:



```bash

mvn spring-boot:run

```



Or run the main Spring Boot application class from IntelliJ IDEA.



The application will start on the configured server port.



\---



\## 🧪 Testing with Postman



The REST APIs can be tested using Postman.



Example request:



```http

POST /generate

```



Example request body:



```json

{

&#x20; "technology": "Java",

&#x20; "experienceLevel": "Fresher",

&#x20; "numberOfQuestions": 10

}

```



Example response:



```json

{

&#x20; "questions": \[

&#x20;   "What is Java?",

&#x20;   "What are the main features of Java?",

&#x20;   "What is the difference between JDK, JRE and JVM?"

&#x20; ]

}

```



> The endpoint and JSON structure should be updated according to the actual implementation of the project.



\---



\## 🧠 Example Prompt



The backend can create a prompt based on the user's input, such as:



```text

Generate 10 interview questions for a Java fresher.



Include questions related to:

\- Core Java

\- OOP

\- Collections

\- Exception Handling

\- Java 8



Return the questions in a clear and numbered format.

```



Gemini then generates the interview questions based on the prompt.



\---



\## 📡 REST API



| Method | Endpoint    | Description                                   |

| ------ | ----------- | --------------------------------------------- |

| POST   | `/generate` | Generates interview questions using Gemini AI |



> Update the endpoint if your actual controller uses a different URL.



\---



\## 🔐 Security



The Gemini API key is sensitive information.



The project follows these security practices:



\* API keys are not stored directly in source code.

\* Environment variables are used for sensitive configuration.

\* `.env` and other sensitive files are excluded using `.gitignore`.

\* API credentials should never be committed to a public GitHub repository.



\---



\## 🎯 Use Cases



This project can be useful for:



\* 👨‍🎓 Students preparing for interviews

\* 👩‍💻 Freshers preparing for technical interviews

\* 💼 Job seekers

\* 🧑‍💻 Developers learning new technologies

\* 🎤 Mock interview preparation



\---



\## 🔮 Future Enhancements



The project can be enhanced with:



\* \[ ] Interview answers with explanations

\* \[ ] Multiple-choice questions

\* \[ ] Coding questions

\* \[ ] Difficulty level selection

\* \[ ] User authentication

\* \[ ] Interview history

\* \[ ] Save generated questions

\* \[ ] Download questions as PDF

\* \[ ] Mock interview mode

\* \[ ] AI-based answer evaluation

\* \[ ] Interview performance analysis

\* \[ ] Voice-based mock interview



\---



\## 📸 Screenshots



Add screenshots of the application here.



Example:



```text

screenshots/

├── home-page.png

├── question-generation.png

└── generated-questions.png

```



You can add screenshots to this README after uploading them to the repository.



\---



\## 📚 Learning Outcomes



Through this project, I gained practical experience in:



\* Java development

\* Spring Boot application development

\* REST API development

\* API integration

\* Generative AI integration

\* Google Gemini API

\* JSON request and response handling

\* Maven

\* Postman API testing

\* Git and GitHub

\* Backend application architecture

\* Exception handling and validation



\---



\## 👩‍💻 Author



\### Pooja Bhoite



\*\*M.Sc. Computer Science | Java Full Stack Developer\*\*



\### Technical Skills



`Java` `Spring Boot` `REST API` `React.js` `JavaScript` `MySQL` `Gemini API` `Maven` `Git` `GitHub`



\---



\## ⭐ Support



If you find this project useful, please consider giving the repository a ⭐ on GitHub.



\---



\## 📄 License



This project is created for educational and portfolio purposes.



