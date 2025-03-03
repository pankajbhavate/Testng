Feature: Register

Scenario Outline: Successful register
  When user open the browser
  And user go to the website "<URL>"
  And user enter the credentials like "<Name>", "<Lastname>", "<Phone>", "<Email>"
  Then user go to homepage

Examples:
  | URL | Name   | Lastname | Phone           | Email          |
  | https://demo.wpeverest.com/user-registration/online-event-registration-form/ | babanrao | bhunawat | 92299292929292  | ww@gmail.con   |
  |https://demo.wpeverest.com/user-registration/online-event-registration-form/ | Dadaro |  amaranrao |  828828828228 |  pankaj@hhshs.com |
  | https://demo.wpeverest.com/user-registration/online-event-registration-form/| sultan | mia|  38383838| pssss@ | 