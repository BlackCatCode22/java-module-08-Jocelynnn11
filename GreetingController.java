package com.jocelyn.tues.Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {
    @RequestMapping("/")
    public String getMyGreeting(){
        return  "<!DOCTYPE html>" +
                "<html lang='en'>" +
                "<head>" +
                "    <meta charset='UTF-8'>" +
                "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
                "    <title>Spring Boot Poem</title>" +
                "    <style>" +
                "        body {" +
                "            font-family: 'Arial', sans-serif;" +
                "            background-color: #f0f8ff;" +
                "            color: #333;" +
                "            text-align: center;" +
                "            padding: 50px;" +
                "        }" +
                "        h1 {" +
                "            color: #2f8f3d;" +
                "        }" +
                "        p {" +
                "            font-size: 1.2em;" +
                "            line-height: 1.6;" +
                "        }" +
                "        .highlight {" +
                "            color: #d14d4d;" +
                "            font-weight: bold;" +
                "        }" +
                "        .verse1 {" +
                "            color: #0000ff;" +
                "        }" +
                "        .verse2 {" +
                "            color: #008080;" +
                "        }" +
                "        .verse3 {" +
                "            color: #ff4500;" +
                "        }" +
                "        .verse4 {" +
                "            color: #800080;" +
                "        }" +
                "    </style>" +
                "</head>" +
                "<body>" +
                "    <h1>A Poem for Spring Boot</h1>" +
                "    <p class='verse1'>" +
                "        In a world of code, so vast and wide,<br>" +
                "        A framework emerged, with Java as its guide.<br>" +
                "        With Spring Boot, the journey begins,<br>" +
                "        A web app awaits, where magic spins." +
                "    </p>" +
                "    <p class='verse2'>" +
                "        No XML, no fuss, no fear to boot,<br>" +
                "        Just annotations, concise and cute.<br>" +
                "        <span class='highlight'>REST APIs</span> come with ease,<br>" +
                "        And databases connect without a sneeze." +
                "    </p>" +
                "    <p class='verse3'>" +
                "        From startup to endpoint, it’s fast and clear,<br>" +
                "        Security, testing, all wrapped in here.<br>" +
                "        With Spring Boot, your project will bloom,<br>" +
                "        Like the flowers of Spring, it finds its room." +
                "    </p>" +
                "    <p class='verse4'>" +
                "        So let’s code together, and let it soar,<br>" +
                "        With Spring Boot, we'll code some more.<br>" +
                "        With Java in hand, and frameworks in tow,<br>" +
                "        Our app will shine, and forever glow." +
                "    </p>" +
                "</body>" +
                "</html>";
    }
    }

