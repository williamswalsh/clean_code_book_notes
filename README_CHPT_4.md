# Comments

- Don't comment bad code - rewrite it.
- Old comments can propagate misinformation.
- Comments compensate for our failure to express ourself in code.
- Comments are always failures.
- Comments can deviate from the code - over time
- Comments can be separated from their content they describe over time.
- Try to make code as clear and expressive so that comments are not required.
- Inaccurate comments are far worse than no comment. -> Noise to Signal ratio
- The only real representation of truth is the code.
- Source Control Mgmt. system should be relied on for versioning information.
- Cut and paste errors occur with superfluous comments
- if commenting out code - remove it!!
- Don't put html in comments - unreadable in plaintext viewer
- Comments shouldn't need to be explained

Ok-ish Comments
- N.B. Sometimes comments can explain the intent behind a decision.
- Warning of consequences
- Clarifying comments - @Ignore(message = "This test takes too long to run")
- Amplify the importance of something

Good Code practice:
- Create method from body of both try and catch blocks.
- Separating creation of a variable from its use to give it an accurate name  
  e.g. if(getResourceFromFile(file).getInputStream().toString())  
       to
       Resource resourceFile = getResourceFromFile(file);
       InputStream resourceInputStream = resourceFile.getInputStream();
       String resourceAsString = resourceInputStream.toString();
- 