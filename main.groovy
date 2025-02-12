pipeline {
    agent any
    stages {
        stage('start') {
            steps {
                sh "ansible-playbook -i hosts task2.yml "
            }
        }
    }   
}