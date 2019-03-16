package emobilis.com.interactivestory.model;

import emobilis.com.interactivestory.R;

/**
 * Created by Kevin Kimaru Chege on 4/10/2017.
 */

public class Story {
    private Page[] mPages;

    public Story(){
        mPages = new Page[7];

        mPages[0] = new Page(
                R.drawable.page0,
                "On your return trip from studying Saturn's rings,\"%1$s\" you hear a distress signal that",
                new Choice("Stop and investigate", 1),
                new Choice("Continue home to earth", 2)
        );

        mPages[1] = new Page(
                R.drawable.page1,
                "On your return trip from studying Saturn's rings, you hear a distress signal ",
                new Choice("Explore the cave", 3),
                new Choice("Explore the rover", 4)
        );

        mPages[2] = new Page(
                R.drawable.page2,
                "On your return trip from studying Saturn's rings, you hear a distress ",
                new Choice("head back to mars to investigate", 4),
                new Choice("Continue home to earth", 6)
        );

        mPages[3] = new Page(
                R.drawable.page3,
                "On your return trip from studying Saturn's rings, you hear a",
                new Choice("Refill at ship and explore the rover", 4),
                new Choice("Continue towards the faint light", 5)
        );

        mPages[4] = new Page(
                R.drawable.page4,
                "On your return trip from studying Saturn's rings, you hear ",
                new Choice("Explore the co-ordinates", 1),
                new Choice("Return to earth", 2)
        );

        mPages[5] = new Page(
                R.drawable.page5,
                "On your return trip from studying \"%1$s\" Saturn's rings, you "

        );

        mPages[6] = new Page(
                R.drawable.page6,
                "On your return trip from studying Saturn's rings, "
        );
    }

    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
}
