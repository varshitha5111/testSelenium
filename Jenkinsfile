pipeline{
	agent any
	
	tools{
		maven 'Maven'
		jdk 'JDK'
	}
	stages{
		stage('Checkout'){
			steps{
				checkout scm
			}
		}
		stage('Build'){
			steps{
				sh 'mvn clean package'
			}
		}
		stage('Test'){
			steps{
				sh 'mvn test'
			}
		}
		stage('Archive Artifacts'){
			steps{
				artifactArchive artifacts:'target/*.jar',fingerprint:true
			}
		}
	}
}
}
