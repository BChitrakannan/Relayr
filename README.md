# Relayr
Search Functionality

Steps to run the code:

Step 1: Import the code to local from https://github.com/BChitrakannan/Relayr. You can download the code as Zip.

Step 2: Extract the code and open it in Eclipse or any other IDE. 

Step 3: Add the selenium jar files and Test NG jar files to the reference library. It has been uploaded as part of the project. Refer the folder "jar needed".
(I didn't use any build tool as I didn't want to make the set up procedure longer). 

Step 3.1: If you are using Eclipse, Right click on the project --> Build Path --> Configure Build Path --> Add External Jars

Step 4: Once all the jars are added, delete the jar needed folder from the project

Step 5: Refresh the project

Step 6: Running from Eclipse or IDE: 
        Simple click on the run button from the IDE. 
        
        Running from the command prompt:
        cd C:\*rootFolder*
        java -cp *rootFolder*\lib\*;*rootFolder*\bin org.testng.TestNG testng.xml
                                         
Step 7: Now you should be able to run the code. You can find the results in testOutput folder.
