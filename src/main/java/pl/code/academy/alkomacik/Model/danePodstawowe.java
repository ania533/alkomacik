package pl.code.academy.alkomacik.Model;

import java.math.BigDecimal;

public class danePodstawowe {
   private int weight;
   private gender gender;
   private alkohole alkohole;
   private int volume;
   private  int quanity;
   private BigDecimal alkomat;

   public danePodstawowe(int weight, gender gender, alkohole alkohole, int volume, int quanity) {
      this.weight = weight;
      this.gender = gender;
      this.alkohole = alkohole;
      this.volume = volume;
      this.quanity = quanity;

   }

   public danePodstawowe() {
   }

   public danePodstawowe(int weight) {
      this.weight = weight;
   }

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public gender getGender() {
      return gender;
   }

   public void setGender( gender gender) {
      this.gender = gender;
   }

   public alkohole getAlkohole() {
      return alkohole;
   }

   public void setAlkohole(alkohole alkohole) {
      this.alkohole = alkohole;
   }

   public int getVolume() {
      return volume;
   }

   public void setVolume(int volume) {
      this.volume = volume;
   }

   public int getQuanity() {
      return quanity;
   }

   public void setQuanity(int quanity) {
      this.quanity = quanity;
   }

   public BigDecimal getAlkomat() {
      return alkomat;
   }

   public void setAlkomat(BigDecimal alkomat) {
      this.alkomat = alkomat;
   }

   @Override
   public String toString() {
      return "danePodstawowe{" +
              "waga=" + weight +
              ", gender=" + gender +
              ", alkohole=" + alkohole +
              ", porcjaAlkoholu=" + volume +
              ", ilosc=" + quanity +
              ", alkomat=" + alkomat +
              '}';
   }
}

