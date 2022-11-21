Criação de um .xlsx baixável

```java
@GetMapping("/export")
  @ApiOperation(value = "Exporta um ODS ou XLSX com base nos parametros informados")
  public void exportConvenios(@RequestParam String entidade,
                              @RequestParam String departamento,
                              @RequestParam Integer ano,
                              @RequestParam TipoExportacaoEnum tipoExportacaoEnum,
                              HttpServletResponse response

  ){

    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("fileName");
    setResponseProperties(response);
    download(response, workbook);
    
  }

  private void setResponseProperties(HttpServletResponse response) {
    response.setHeader("Content-Disposition", "attachment;filename=Convenios.xlsx;Accept: */*");
    response.setContentType("application/octet-stream");
  }

  private void download(HttpServletResponse response, Workbook workbook){
    try (ServletOutputStream outputStream = response.getOutputStream()) {
        workbook.write(outputStream);
        workbook.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```
