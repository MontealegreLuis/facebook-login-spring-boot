# Spring Boot SSO with Facebook

This is a Spring Boot application that authenticates users via Facebook

## Installation

You will need a [Facebook application][facebook] with Facebook Login enabled. 
The `example.properties` file already has the settings for Facebook.

Create your application properties with the following command

```
$ cp src/main/resources/example.properties src/main/resources/application.properties
```

You only need to add your Facebook application client ID and client secret.

## Usage

Run the application with the command below

```
$ mvn spring-boot:run
```

[facebook]: https://developers.facebook.com/
