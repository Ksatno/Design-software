public class ColaAdvertising extends Advertising
{
    public int count = 0;
    @Override
    public void ShowAd(String _ad)
    {
        _ad="Великолепная реклама Coca-cola\n";
        count++;
        super.ShowAd(_ad);
    }
}
