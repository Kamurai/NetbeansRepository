package Section1;

public class Layout
{
    Main.Universal bob;
    Custom joe;

    public Layout(Custom CustomJoe)
    {
        bob = new Main.Universal();
        joe = CustomJoe;
    }

    public String WriteWebpage(int input, int level, int extension)
    {
        String Result = "";
        Result += "<body id=\"idBody\">";
        Result += "<font color=\"white\">";
            Result += "<table id=\"idTableMain\">";
                Result += "<tr id=\"idHeaderRow\">";
                    Result += "<td id=\"idHeaderRowCenter\" colspan=\"3\">";
                        Result += bob.TitlePicture(level);
                    Result += "</td>";
                Result += "</tr>";
                Result += "<tr id=\"idNavigationRow\">";
                    Result += "<td id=\"idNavigationBar\" colspan=\"3\">";
                        Result += bob.NavBar(level, extension);
                    Result += "</td>";
                Result += "</tr>";
                Result += "<tr id=\"idCenterRow\">";
                    Result += "<td id=\"idCenterRowLeft\">";
                        Result += "<h4>";
                            Result += "Navigation";
                        Result += "</h4>";
                        Result += joe.Navigation(level, extension);
                    Result += "</td>";
                    Result += "<td id=\"idCenterRowMain\">";
                        Result += joe.Title(input);
                        Result += joe.Header(input);
                        Result += joe.Content(input);
                    Result += "</td>";
                    Result += "<td id=\"idCenterRowRight\">";
                        Result += "<h4>";
                            Result += "Information";
                        Result += "</h4>";
                        Result += bob.Information();
                        Result += joe.Versions(input);
                    Result += "</td>";
                Result += "</tr>";
                Result += "<tr id=\"idFooterRow\">";
                    Result += "<td id=\"idFooterMain\" colspan=\"3\">";
                            Result += "<p id=\"idFooterContent\">";
                                Result += bob.Footer();
                            Result += "</p>";
                            Result += "<p id=\"idFooterContent\">";
                                    Result += bob.WebMaster();
                            Result += "</p>";
                    Result += "</td>";
                Result += "</tr>";
            Result += "</table>";
        Result += "</font>";
        Result += "</body>";
        return Result;
    }
}
