**Testing Framework for The Devowelizer Service**

Contains code for testing the functionalities of the URL "localhost:8080/" using Selenium WebDriver

Used Java as a programming language and TestNG as a testing framework
Used Maven for managing all dependencies needed for the project and used GitHub for version control to check-in the code files.
The framework is built with Page Object Model.
The framework is very modular and I have created page classes for all common components, not just for a particular page. if there is something common that occurs in different pages , then we create a page object for that also so the different test classes can make use of it. Avoiding all the redundancy by following DRY code principle.
Created Utilities class that performs generic actions across the automation execution, for example, sleep(), getScreenshotName(), and verifyTextContains().
Created CudtomDriver class that implements the WebDriver interface and overrides its methods to make the code more reusable and efficient.

*Important Notes*
There are two test cases that are suppose to fail..
- The first one: when the keyword we want to remove the vowels characters from string contais special characters like "!@#$%^&*()", in this case the expected result should be "!@#$%^&*()", but the actual result is "!@"
- The second one is when the keyword  contains Capital (uppercase) Vowels characters, the expected result should be "HLL Wrld", but the actual result is "HELLO Wrld"
