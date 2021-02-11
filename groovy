pipeline {
	tools{
		jdk 'myjava'
		maven 'mymaven'
	}
	
	agent none
	stages{
		stage('Checkout'){
			agent any
			steps{
				git 'https://github.com/Chethan111/game-of-life.git'
			}
		}
		stage('compile'){
			agent any
			steps{
			 	sh 'mvn compile'
			}
		}
		stage('Test'){
			agent any
			steps{
			 	sh 'mvn test'
			}
		}
		stage('Package'){
			agent any
			steps{
			 	sh 'mvn package'
			}
		}
	}
}
