Jenkins Shared Library Test
======

This repo demonstrate the minimal viable best practice for Jenkins Shared Library. I


node {
    helloworld {
        stage("extra step") {
            sh "echo publish"
        }
    }
}