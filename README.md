# minderaTest
This project was an QAE Automation testing, developed as a 'test-of-skills' to a junior QAE job position. 
 
## Config 
- Firstly, follow the instructions on the link bellow, 
`https://bitbucket.org/mindera/qa-sortable-challenge/src/master/` 
 
- Then, open a terminal window on this project location and run 

`$ java -jar selenium-server-standalone-3.141.59.jar -role hub` 
 
- Open a second terminal window on the same location and run
  
`$ java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register` 

This will run and configure a selenium server locally on the machine to execute the tests. 
 
## Launch 
import the project to your favorite java capable IDE, and execute the test suite   

## Credits
- [Jonathan Cuendet](https://github.com/JOCuendet)
