pipeline {
    agent { label 'built-in' }
    environment {
        DISCORD_WEBHOOK = credentials('discord-webhook-devops')
    }
    
    stages {
        stage('Building...') {
            steps {
                sh "MAVEN_SKIP_RC=true JAVA_HOME=/Disk1/jdks/jdk-18.0.2.1 mvn clean -DskipTests install deploy"
            }
        }
    }
    post {
        always {
                        deleteDir()
discordSend description: "Build: " + env.BUILD_NUMBER + "\nStatus: " + currentBuild.currentResult, link: env.BUILD_URL, result: currentBuild.currentResult, title: JOB_NAME + " #" + env.BUILD_NUMBER, webhookURL: env.DISCORD_WEBHOOK
        }
    }
}
