rootProject.name = "NatureReviveRewrite"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

include("naturerevive-common")

listOf("1_17", "1_18", "1_18_2", "1_19", "1_19_1", "1_19_3", "1_19_4").forEach {
    include(":naturerevive-spigot:nms:nms-$it")

    findProject(":naturerevive-spigot:nms:nms-$it")?.name = "nms-$it"
}

include("naturerevive-spigot")
