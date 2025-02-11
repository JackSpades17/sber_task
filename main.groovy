pipeline {
    agent any
    stages {
        stage('start') {
            steps {
                sh "rm -rf sber_task"
                sh "git clone https://github.com/JackSpades17/sber_task.git"
                sh "ansible-playbook -i ./sber_task/hosts ./sber_task/task2.yml "
                
            }
        }
    }   
}