pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
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
        
                stage('Release') {
            steps {
                echo 'Releasing...'
            }
        }
        
    }
    
    post 
    {
        failure
        {
            emailext body: 'Summary of Pipeline statuts', subject: 'Pipeline Statuts', to: 'youssef.aitelhaj@outlook.com'
        }
    }
}
