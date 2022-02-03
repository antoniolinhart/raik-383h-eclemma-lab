# raik-383-eclemma-lab
### Introduction

Students at the Raikes School have recently started work on prediction algorithms for the popular Among Us game. They have replicated a portion of the game in Java and have added an additional class titled `SuspiciousCalculator` to capture different prediction functionalities, but they forgot to add unit tests! You want to use a metric to determine code coverage for your test suite.

### EclEmma

Code coverage is a metric that can help determine how much of your code is executed by unit tests. You will be using a built-in extension of Eclipse called EclEmma. After cloning and opening this project in Eclipse, you can run EclEmma:

1. Right click on the project

2. Click on `Coverage As -> JUnit Test`

   <img src="../images/Step2.png" alt="Screenshot showing how to run EclEmma" style="zoom:25%;" />

3. A panel will then pop up showing the code coverage for the different packages and the classes in the project

4. Lines that have been covered will be highlighted in green and lines that have not will be highlighted in red

   <img src="../images/Step4.png" alt="Screenshot showing code coverage percents and red/green lines" style="zoom:25%;" />

5. To remove these highlights, select `Remove All Sessions ` in the panel

   <img src="../images/Step5.png" alt="Screenshot showing button for removing all sessions" style="zoom:50%;" />

### Challenge

Work with your partners to obtain as much code coverage as possible in the `src.edu.unl.raikes.amongus` part of the codebase. However, you are allowed only 20 unit tests! Each unit test must abide by the traditional best practices for unit tests, meaning you cannot use loops or other strategies to effectively violate the "one assert per unit test" rule. Write unit tests that test very specific pieces of functionality and are concise. All tests require an error message, making it clear what went wrong. “Was True, should have been False” is not a sufficient message.

### Deliverables

Take a screenshot of your code coverage and add the screenshot to your reflection paper.


**Reflection paper:** As a group, write a 2-3 page double spaced reflection paper outlining your experience creating the unit tests. Discuss at least the following topics:

1. How code coverage is a useful metric
2. What code coverage does or does not tell you about your unit tests
3. How you could have used code coverage on previous assignments in other coding courses to create better unit tests
4. Any general takeaways from this tool and its output
5. How you could apply what you learned to the class project


**Code:** Submit your team's `AmongUsTests.java` file with your 20 completed unit tests to Canvas as a separate file.
