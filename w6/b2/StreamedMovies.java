public class StreamedMovies extends Records
{
    @Override
    public StreamedMovie find(int id)
    {
        return (StreamedMovie)super.find(id);
    }
    
    public void add()
    {
        System.out.println("Add a video");
        StreamedMovie movie = new StreamedMovie(++id, 
                                In.readName("Movie"), 
                                In.readDouble("Movie price "), 
                                In.readInt("Movie rental period "));
        super.add(movie);
        System.out.println(movie.toString() + " added");
    }    
    
    @Override
    public String toString()
    {
        return "Movies\n" +  super.toString();
    }
}