def call() {
    stages {
        stage("Build") {
            sh "echo install"
        }
        stage("Test") {
            sh "echo test"
        }
        stage("Deploy") {
            sh "echo publish"
        }
    }
}
