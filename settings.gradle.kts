/*
 * MIT License
 *
 * Copyright (c) 2016 Alibaba Group
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
pluginManagement {
    repositories {
        maven(uri("$rootDir/repo"))
        mavenLocal()
        maven("https://s01.oss.sonatype.org/content/repositories/public/")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/google/")
        maven("https://artifact.bytedance.com/repository/byteX/")
        maven("https://artifact.bytedance.com/repository/pangle")
        google()
        mavenCentral()
        gradlePluginPortal()
//        maven("https://plugins.gradle.org/m2/")
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven(uri("$rootDir/repo"))
        mavenLocal()
        maven("https://s01.oss.sonatype.org/content/repositories/public/")
        maven("https://oss.sonatype.org/content/repositories/snapshots/")
        maven("https://maven.aliyun.com/repository/public")
        maven("https://jitpack.io")
        maven("https://artifact.bytedance.com/repository/byteX/")
        maven("https://artifact.bytedance.com/repository/pangle")
        //不能用
//        maven{
//            url = uri("http://repo.baichuan-android.taobao.com/content/groups/BaichuanRepositories/")
//            isAllowInsecureProtocol = true
//        }
        gradlePluginPortal()
        mavenCentral()
        google()
    }

}


include(":vlayout")
include(":examples")
