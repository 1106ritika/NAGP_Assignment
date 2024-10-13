pipeline{
	agent any
	
	tools{
		jdk 'JDK'
		maven 'Maven_HOME'
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