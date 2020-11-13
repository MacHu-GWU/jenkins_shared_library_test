pipeline {
    agent {
        node {
            label ''
        }
    }
    stages {
        stage('hello') {
            steps {
                script {
                    sh """
                        which aws
                        aws s3 ls
                    """
                }
            }
        }
    }
}
