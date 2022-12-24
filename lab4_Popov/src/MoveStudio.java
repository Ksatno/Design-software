public class MoveStudio
{
    private Actor actor;
    private Writer writer;
    private FilmDirector filmDirector;
    private VideoEditor videoEditor;
    private Producer producer;
    private String move;
    MoveStudio()
    {
        this.actor = new Actor();
        this.writer = new Writer();
        this.filmDirector = new FilmDirector();
        this.videoEditor = new VideoEditor();
        this.producer = new Producer();
        this.move = "";
    }
    public String MakeMove()
    {
        this.move= this.writer.WriteSkript(this.move);
        this.move= this.actor.Actoring(this.move);
        this.move= this.filmDirector.MakeScene(this.move);
        this.move= this.videoEditor.MakeMontage(this.move);
        this.move= this.videoEditor.MakeEffects(this.move);
        this.move= this.producer.MakeRealese(this.move);
        return this.move;
    }
}
