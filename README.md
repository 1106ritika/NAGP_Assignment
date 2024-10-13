**Download Jenkins:**
Visit the Jenkins Download Page and choose the appropriate installer for your operating system.

**Install Jenkins**
Command in terminal: brew install jenkins.

**Start Jenkins**
Command to start Jenkins in terminal: brew services start jenkins.
Command to restart Jenkins in terminal: brew services restart jenkins.

**Access Jenkins**
Go to browser and navigate to http://localhost:8080 to open Jenkins.
Retreive Administrator password from the initialAdminPassword file .
Use this password to unlock Jenkins.

**How to Configure JDK in Jenkins**
Go to Manage Jenkins -> Tools.
Under JDK installations, click Add JDK.
Give the name for JDK.
Also, provide the JAVA_HOME path.

**How to Configure Maven in Jenkins**
Go to Manage Jenkins -> Tools.
Under Maven installations, click Add Maven.
Give the name for Maven.
Also, provide the Maven_HOME path.

**Push code into Git**
Navigate to the project folder through terminal (to project NAGP_DevTestOps).
Type command git init.
Use command git status to see what is pending to commit.
Use command git add . to add all files in the project to the git or use command git add <file name> to add a specific file.
Use command git remote add origin <git repository URL>.
Use command git commit -m <“Commit Successful”>.
Use command git push -u origin master or git push -u origin main.
Give the username for your GitHub account.
To do the authentication for the GitHub account, go to GitHub Account dropdown -> Settings -> Developer Settings -> Personal access tokens -> Click on Generate new token.
Generate the token and copy it.
Now go back to terminal and paste the token in place of password.
Press Enter.

**Create freestyle Job**
On the Jenkins Dashboard, tap on New Item.
Give the name for your job and select item type as Freestyle project and click on OK button.
Now fill in the description.
In Source Code Management field, give the Git repository URL and the branch.
Now, select the build trigger. For the assignment, we have selected Build periodically option. H/15 * * * * indicates that the build will run every 15 minutes.
Write the steps in Build Steps that are to be executed in the pipeline.
Save the Job.
Now, go to Jenkins Dashboard and tap on the play button alongside your job to manually run the job.
You can also tap on the job to open it and then click on the Build Now option.

**Create Pipeline**
On the Jenkins Dashboard, tap on New Item.
Give the name for your pipeline and select item type as Pipeline and click on OK button.
Now fill in the description.
Now, select the build trigger. For the assignment, we have selected Build periodically option. H/15 * * * * indicates that the build will run every 15 minutes.
Now, to use Jenkinsfile in our pipeline, we will select the Pipeline script from SCM option in Definition field under Pipeline. 
Under SCM, we will select Git option and give our repository URL.
Also, provide the respective branch and the Script Path.
Save the Job.
Now, go to Jenkins Dashboard and tap on the play button alongside your job to manually run the job.
You can also tap on the job to open it and then click on the Build Now option.

**How to download SonarQube**
Visit the SonarQube Download Page and choose the appropriate installer for your operating system.
Unzip the downloaded file and install it.

**Start SonarQube**
Command to start SonarQube in terminal: ./sonar.sh start.
Command to restart SonarQube in terminal: ./sonar.sh restart.
Command to stop SonarQube in terminal: ./sonar.sh stop.

**Access SonarQube**
Go to browser and navigate to http://localhost:9000 to open SonarQube.
Log in with default credentials (admin / admin).
Change the admin password as prompted.

**How to Configure SonarQube in Jenkins**
Install SonarCube plugin.
Go to Manage Jenkins -> System.
Scroll down to SonarQube Servers.
Under SonarQube installations, click Add SonarQube.
Give the name and Server URL for SonarQube.
For Server authentication token:
Click on Add -> Jenkins.
Give Domain as: Global credentials (unrestricted).
Give Kind as: Secret text.
Go to Sonar -> My Account -> Security.
Give the token name, type and duration and generate the token. Copy it.
Come back to Jenkins and paste the token in Secret field.
Provide an ID for the secret.
Click on Add.
Under Server Authentication token, select the ID name that was provided previously.

**Configuration for SonarQube Analysis in Job**
Under Build Environment, checkmark the box for Prepare SonarQube Scanner environment.
Create the token here or provide the ID for the global Sonar token.
In Build Steps, the step needs to be man install

**How to download JFrog**
Visit the JFrog Download Page and choose the appropriate installer for your operating system.
Unzip the downloaded file and install it.

**Start JFrog**
Command to start JFrog in terminal: ./artifactory.sh start.

**Access JFrog**
Go to browser and navigate to http://localhost:8081 to open JFrog.
Log in with default credentials (admin / admin).
Set up initial configurations.

**How to Configure JFrog in Jenkins**
Install Artifactory plugin.
Go to Manage Jenkins -> System.
Scroll down to JFrog.
Click on Add JFrog Platform Instance.
Provide a unique ID in instance ID.
Give the URL for JFrog.

**How to Create Repository in JFrog**
Go to JFrog.
Navigate to Repositories -> Add Repositories -> Local Repository.
Select Maven Package Type.
Provide the repository key, environment and other fields.

**Configuration for JFrog Analysis in Job**
In Post-build Actions, add Deploy artifacts to Artifactory.
Specify the Artifactory server, repository, and artifact path.
Configuration for JFrog Analysis in Job
In Post-build Actions, add Deploy artifacts to Artifactory.
Specify the Artifactory server, repository, and artifact path.
