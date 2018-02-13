pipeline {
	agent any

	stages {
		stage('Build') {
			steps {
				echo 'Building...'
				git 'https://github.com/DevopsProject1/CdLibraryMgmt.git'
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
