public interface WRM{
  
  public boolean canDoctorGOHome();
  public void showAllPatient();
  public void cancelAll();
  public void registerPatient(Patient item);
  public Patient servePatient();
}