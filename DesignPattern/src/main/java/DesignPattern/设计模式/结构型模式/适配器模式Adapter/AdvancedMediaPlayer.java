package 设计模式.结构型模式.适配器模式Adapter;

public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}