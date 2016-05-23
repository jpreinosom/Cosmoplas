package cosmoplas.reglas;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Firma implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("idMovimiento")
   private java.lang.Integer idMovimiento;
   @org.kie.api.definition.type.Label("idBodega")
   private java.lang.Integer idBodega;
   @org.kie.api.definition.type.Label("fechaMovimiento")
   private java.util.Date fechaMovimiento;
   @org.kie.api.definition.type.Label("validacion")
   private java.lang.Boolean validacion;

   @org.kie.api.definition.type.Label(value = "fechaDespacho")
   private java.util.Date fechaDespacho;

   public Firma()
   {
   }

   public java.lang.Integer getIdMovimiento()
   {
      return this.idMovimiento;
   }

   public void setIdMovimiento(java.lang.Integer idMovimiento)
   {
      this.idMovimiento = idMovimiento;
   }

   public java.lang.Integer getIdBodega()
   {
      return this.idBodega;
   }

   public void setIdBodega(java.lang.Integer idBodega)
   {
      this.idBodega = idBodega;
   }

   public java.util.Date getFechaMovimiento()
   {
      return this.fechaMovimiento;
   }

   public void setFechaMovimiento(java.util.Date fechaMovimiento)
   {
      this.fechaMovimiento = fechaMovimiento;
   }

   public java.lang.Boolean getValidacion()
   {
      return this.validacion;
   }

   public void setValidacion(java.lang.Boolean validacion)
   {
      this.validacion = validacion;
   }

   public java.util.Date getFechaDespacho()
   {
      return this.fechaDespacho;
   }

   public void setFechaDespacho(java.util.Date fechaDespacho)
   {
      this.fechaDespacho = fechaDespacho;
   }

   public Firma(java.lang.Integer idMovimiento, java.lang.Integer idBodega,
         java.util.Date fechaMovimiento, java.lang.Boolean validacion,
         java.util.Date fechaDespacho)
   {
      this.idMovimiento = idMovimiento;
      this.idBodega = idBodega;
      this.fechaMovimiento = fechaMovimiento;
      this.validacion = validacion;
      this.fechaDespacho = fechaDespacho;
   }

}