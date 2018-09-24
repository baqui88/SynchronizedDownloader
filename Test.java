package network.packs.downloader;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		DownloadManager downloadManager = DownloadManager.getInstance();
		String drive = "https://drive.google.com/open?id=1nmtHCwCOp8S6-6du72sio4F8fJOgdBwl";
		String javase = "http://download.oracle.com/otn-pub/java/jdk/10.0.2+13/19aef61b38124481863b1413dce1855f/jdk-10.0.2_windows-x64_bin.exe";
		String despatico = "https://youtu.be/kJQP7kiw5Fk";

		/*** type you save direcotry ***/
		String saveDirectory = "";
		try {
			DownloadMission mission = new DownloadMission(drive,
					saveDirectory, "simpleSolve");
			downloadManager.addMission(mission);
			DownloadMission mission2 = new DownloadMission(despatico,
					saveDirectory, "test2");
			downloadManager.addMission(mission2);
			DownloadMission mission3 = new DownloadMission(javase, saveDirectory,
					"test3");
			downloadManager.addMission(mission3);
			downloadManager.start();
			int counter = 0;
			while (true) {
				// System.out.println("The mission has finished :"
				// + mission.getReadableSize() + "Active Count:"
				// + mission.getActiveTheadCount() + " speed:"
				// + mission.getReadableSpeed() + " status:"
				// + mission.isFinished() + " AverageSpeed:"
				// + mission.getReadableAverageSpeed() + " MaxSpeed:"
				// + mission.getReadableMaxSpeed() + " Time:"
				// + mission.getTimePassed() + "s");
				System.out.println("Downloader information Speed:"
						+ downloadManager.getReadableTotalSpeed()
						+ " Down Size:"
						+ downloadManager.getReadableDownloadSize());
				Thread.sleep(1000);
				counter++;
				// if (counter == 6) {
				// mission.pause();
				// }
				// if (counter == 11) {
				// downloadManager.start();
				// }
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
