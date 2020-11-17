def call(Closure body) {
    node {
        stage("Build") {
            sh "echo install"
        }
        stage("Test") {
            sh "echo test"
        }
        stage("Deploy") {
            sh "echo deploy"
        }
        body()
    }
}
