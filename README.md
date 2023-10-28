# Email Microservice

Email Microservice is a simple and scalable email sending service developed using Spring Boot.

## Functionalities
When correctly implementing or configuring this microservice, it listens to certain instructions from applications connected to the same homebroker, and so you can pass commands to it, whether it be a configured message, data or anything else.

## Functionalities

- Sending asynchronous emails.
- Support for configurable email templates.
- Easy integration with other services and applications.

## Technologies Used

- Spring Boot: Java Framework for creating standalone applications based on Spring.
- Java: Main programming language.
- RabbitMQ: Messaging system for implementing asynchronous queues.

## Prerequisites

- Java 11 or higher
- RabbitMQ (can be run as a java dependency)

## Settings

1. Clone the repository:
   ```bash
   git clone https://github.com/Gablier-R/email-microservice.git

2. Configure the homebroker (CloudAMQP):
   Create an account at a desired homebroker and create a queue to be able to execute the instructions.
   If you want to be able to create another exchange, the one used in this project was the default.
