package SoftwareScience;

/**
 * Created by noko on 2016/07/10.
 */
public class Main
{
    public static void main(String[] args)
    {
        String filePath = "/Users/noko/Desktop/Seiseki.dat";
        if (args.length != 0)
        {
            filePath = args[0];
        }
        try
        {
            Score[] scores = ParseData.parseData(FileManager.readFileSync(filePath));
            System.out.println(new ScoreAssessment(scores));
        } catch (Exception e)
        {
            System.out.println("ファイル読み込みエラー");
            e.printStackTrace();
        }
    }
}

