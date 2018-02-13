pipeline {
	agent any
	
	tools {
		maven 'apache-maven-3.0.4'
		jdk 'jdk8'
	}

	stages {
		stage('Initialize') {
			steps {
				bat '''
				echo "PATH=${PATH}"
				echo "M2_HOME=${M2_HOME}"
				'''
			}
		}
		stage('Build') {
			steps {
				echo 'Building...'
				git 'https://github.com/DevopsProject1/CdLibraryMgmt.git'
				bat 'mvn clean install -DskipTests'
			}
		}
		stage('Test') {
			steps {
				echo 'Testing...'
			}
		}
		stage('Deploy') {
			steps {
				echo 'Deploying...'
			}
		}
	}
}
