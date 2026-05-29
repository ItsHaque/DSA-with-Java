An interesting problem encountered while printing Pattern6

code snippet:

<img width="598" height="270" alt="image" src="https://github.com/user-attachments/assets/6922c757-2931-4467-99c4-b4a5ceddb9c0" />

output: 

<img width="278" height="170" alt="image" src="https://github.com/user-attachments/assets/ea50840d-8339-4490-838c-1e758b90bc23" />

explanation: notice the single qout (' ') in the print statement for printing space. In Java, '  ' is a character with ASCII value 32. 🤣 so for the output, it was just adding 32 to the value of 'j'. To print the space, i had to use double quot (" ").
