java-multithread-downloader
===========================

###What?

This is a small java download library which supports multithread.

###How?

```java

downloader

DownloadManager downloadManager = DownloadManager.getInstance(); 

//Step1: we need construct a mission

String qLink = "http://nguyenbaqui.com/files/something.exe";
String saveDirectory = "";
String newName = "myApp.exe"

DownloadMission mission = new DownloadMission(qQString,saveDirectory, newName);

//Step2: deliver this mission to manager

downloadManager.addMission(mission);

//Step3: Let's start

downloadManager.start();

```

### Utilities

There are some useful method you can use:

```java

mission.getReadableSize() //get mission target file size (which is readable end with KB/MB/GB…)

mission.getReadableSpeed() //get mission's readable downloading speed

mission.getReadableAverageSpeed() downloader

mission.getReadableMaxSpeed() downloader
 
mission.getActiveTheadCount() // get mission's downloading thread count

mission.isFinished() //judge if a mission is finished

mission.getTimePassed() downloader

mission.pause() //pause this mission ,and it will automatically resume when you start again. 

```