pipeline{
	agent any
	
	tools{
		jdk 'JDK'
		maven 'Maven_HOME'
	}
	
	environment {
        SONARQUBE = 'SonarQube Server'
        ARTIFACTORY = 'Artifactory Server'
    }
	
	stages{
		stage('Checkout'){
			steps{
				echo 'Cloning the repository'
				git branch: 'main', url: 'https://github.com/1106ritika/NAGP_Assignment.git'
			}
		}
		stage('Build'){
			steps{
				echo 'Testing Started'
				sh 'mvn clean install'
			}
		}
		stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube Server') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
        stage('Artifactory') {
            steps {
				rtMavenDeployer(
					id: 'deployer',
					serverId: '123456@Artifactory',
					releareRepo: 'nagp.assignment',
					snapshotRepo: 'nagp.assignment'
				)
				rtMavenDRun(
					pom: 'pom.xml',
					goals: 'clean install',
					deployerId: 'deployer'
				)
				rtPublishBuildInfo(
					serverId: '123456@Artifactory'
				)
                sh 'jfrog rt upload "target/*.jar" "https://github.com/1106ritika/NAGP_Assignment.git"'
            }
        }
	}
	
	post{
		always{
			echo 'Job Run Complete!!!'
		}
		success{
			echo 'Build Success!!!'
		}
		failure{
			echo 'Build Failure!!!'
		}
	}
}