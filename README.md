# ✨ Envite BPM AI Hackday: Integrating BPM with AI

Elevating Business Process Management (BPM) by integrating it with Artificial Intelligence (AI) and Machine Learning (ML).

In this project, we utilize Camunda 8 to orchestrate an AI-driven workflow. Our objective is to create connectors and establish BPMN patterns that harness the capabilities of machine learning and large language models, enabling the safe automation of such workflows.

# 🔭 Overview
This repository hosts the preconfigured backend service for the Envite BPM AI Hackday. Camunda 8 operates within Docker containers, providing a flexible environment for orchestrating AI-driven workflows. The Spring Boot backend service harnesses the power of the Langchain4J Framework to integrate cutting-edge AI capabilities. It can either be launched directly from the IDE or deployed as a Docker container.

# 📙 Prerequisites
- Docker: https://docs.docker.com/get-docker/
- Camunda Modeler: https://camunda.com/de/download/modeler/

# 🚀 Quick Start Guide
To build the backend application, execute `mvn clean install` in the root directory. Subsequently, run `docker-compose up --build` to containerize the backend service and initiate Camunda 8.

You can now access the various web applications. Use the username `demo` and the password `demo` to log in.
- Operate: [http://localhost:8081](http://localhost:8081)
- Tasklist: [http://localhost:8082](http://localhost:8082)
- Elasticsearch: [http://localhost:9200](http://localhost:9200)

# 🔍 Evaluation
To evaluate the basic functionality, you can interact with the following test endpoints:
- `GET` http://localhost:8700/test
- `GET` http://localhost:8700/assistant

Additionally, you have the ability to initiate a new basic process instance in Operate and successfully accomplish the generated UserTask.

Please ensure that the backend service is either executed from the IDE or deployed as a Docker container, as both utilize the same port for communication.

# 💡 Useful Links
- [Camunda AI Overview](https://camunda.com/resources/leverage-ai-powered-automation/)
- [Camunda AI Process Enhancement](https://camunda.com/blog/2024/02/how-artificial-intelligence-can-enhance-business-process/)
- [Langchain4J Intro](https://docs.langchain4j.dev/intro)
- [Introduction to LLMs and LangChain4J](https://www.baeldung.com/java-langchain-basics)
- [Langchain4J Repo](https://github.com/langchain4j/langchain4j)
- [Langchain4J Examples Repo](https://github.com/langchain4j/langchain4j-examples) ⭐
- [Langchain4J Spring Examples Repo](https://github.com/langchain4j/langchain4j-spring)
- [Tips for Promt Engineering](https://medium.com/@karankakwani/mastering-prompt-engineering-for-chatgpt-tips-tricks-and-best-practices-a2d01b703dab)
- [Camunda Platform Repo](https://github.com/camunda/camunda-platform)
