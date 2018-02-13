pipeline {
	agent any

	stages {
		stage('Build') {
			steps {
				echo 'Building...'
				git 'https://github.com/DevopsProject1/CdLibraryMgmt.git'
				sh 'mvn clean install -DskipTests'
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
