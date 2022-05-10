pipeline {
    agent any
    stages{
        stage('Test Category Printing') {
            steps {
                sh """#!/usr/bin/env bash
                echo "Hellooooo Boss"
                """
            }
        }
        stage('Print List of Changed Files') {
            steps {
                script{
                    if(env.GIT_BRANCH =='master') {
                        def requiredFilesFound = "false"
                        def changeLogSets = currentBuild.changeSets
                        for (int i = 0; i < changeLogSets.size(); i++) {
                            def entries = changeLogSets[i].items
                            for (int j = 0; j < entries.length; j++) {
                                def entry = entries[j]
                                echo "${entry.commitId} by ${entry.author} on ${new Date(entry.timestamp)}: ${entry.msg}"
                                def files = new ArrayList(entry.affectedFiles)
                                if(files.contains("Start.java") || files.contains("TextBox.java")) {
                                    println("Required Files Found, Proceeding to Build Image")
                                }
                            }
                        }
                    } else {
                        println("Not Branch Master")
                    }
                }
            }
        }    
    }
}
