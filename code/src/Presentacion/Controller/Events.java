package Presentacion.Controller;

public class Events {
	// MESA
	public static final int ABRIR_VMESA = 100;
	public static final int MESA_ID_INEXISTENTE = 101;
	public static final int MESA_DATOS_INCORRECTOS = 102;
	
	public static final int ABRIR_VMODIFICAR_MESA = 1100; //El ultimo 0 es de abrir
	public static final int ABRIR_VMODIFICAR_MESA2 = 1101; //El ultimo 0 es de abrir
	public static final int MODIFICAR_MESA = 110;
	public static final int MODIFICAR_MESA2 = 115;
	public static final int MODIFICAR_MESA_OK = 111;
	public static final int MODIFICAR_MESA_KO = 116;
	public static final int MODIFICAR_MESA_NUMMESA_EXISTENTE = 113;
	
	public static final int ABRIR_VALTA_MESA = 1200; 
	public static final int ALTA_MESA = 120;
	public static final int ALTA_MESA_OK = 121;
	public static final int ALTA_MESA_KO = 122;
	public static final int ALTA_MESA_NUM_MESA_YA_EXISTE = 123;
	
	public static final int ABRIR_VBAJA_MESA = 1300;
	public static final int BAJA_MESA = 130;
	public static final int BAJA_MESA_OK = 131;
	public static final int BAJA_MESA_KO = 132;
	public static final int BAJA_MESA_YA_INACTIVO = 133;
	
	public static final int ABRIR_VMOSTRAR_UNA_MESA = 1400;
	public static final int MOSTRAR_UNA_MESA = 140;
	public static final int MOSTRAR_UNA_MESA_OK = 141;
	public static final int MOSTRAR_UNA_MESA_KO = 142;
	
	public static final int ABRIR_VMOSTRAR_MESA_TODAS = 1500;
	public static final int MOSTRAR_MESA_TODAS = 150;
	
	
	// FACTURA
	public static final int ABRIR_VFACTURA = 200;
	
	public static final int ERROR_FACTURA_MESA_INACTIVA = 2001;
	public static final int ERROR_FACTURA_POR_EMPLEADO = 2002;
	public static final int ERROR_FACTURA_DISPONIBILIDAD_MESA = 2003;
	public static final int ERROR_FACTURA_ID_INEXISTENTE = 2004;
	public static final int ERROR_FACTURA_DATOS = 2005;
	public static final int ERROR_FACTURA_MENU_INEXISTENTE = 2006;
	public static final int ERROR_FACTURA_STOCK = 2007;
	public static final int ERROR_FACTURA_LINEA_INEXISTENTE = 2008;

	
	public static final int ABRIR_VMODIFICAR_FACTURA = 2100;
	public static final int ABRIR_VMODIFICAR_FACTURA2 = 2101;
	public static final int MODIFICAR_FACTURA = 210;
	public static final int MODIFICAR_FACTURA2 = 215;
	public static final int MODIFICAR_FACTURA_OK = 211;
	public static final int MODIFICAR_FACTURA_KO = 212;
	public static final int MODIFICAR_FACTURA_IDS_INEXISTENTES = 213;
	
	public static final int ABRIR_VALTA_FACTURA = 2200;
	public static final int ALTA_FACTURA = 220;
	public static final int ALTA_FACTURA_OK = 221;
	public static final int ALTA_FACTURA_KO = 222;
	public static final int ALTA_FACTURA_IDS_INEXISTENTES = 223;
	public static final int ALTA_FACTURA_MESA_YA_ASOCIADA = 224;
	
	public static final int ABRIR_VDEVOLVER_MENU = 2300; 
	public static final int DEVOLVER_MENU = 230;
	public static final int DEVOLVER_MENU_OK = 231;
	public static final int DEVOLVER_MENU_KO = 232;
	public static final int DEVOLVER_MENU_ID_FACTURA_INEXISTENTE = 233;
	public static final int DEVOLVER_MENU_NO_RELACIONADOS = 234;
	
	public static final int ABRIR_VMOSTRAR_UNA_FACTURA = 2400;
	public static final int MOSTRAR_UNA_FACTURA = 240;
	public static final int MOSTRAR_UNA_FACTURA_OK = 241;
	public static final int MOSTRAR_UNA_FACTURA_KO = 242;
	
	public static final int ABRIR_VMOSTRAR_FACTURA_TODAS = 2500;
	public static final int MOSTRAR_FACTURA_TODAS = 250;
	public static final int MOSTRAR_FACTURA_TODAS_OK = 251;
	public static final int MOSTRAR_FACTURA_TODAS_KO = 252;
	
	public static final int ABRIR_VMOSTRAR_POR_EMPLEADO = 2600;
	public static final int MOSTRAR_FACTURA_POR_EMPLEADO = 261;
	public static final int MOSTRAR_FACTURA_POR_KO = 262;
	
	public static final int ABRIR_VMOSTRAR_POR_MESA = 2650;
	public static final int MOSTRAR_FACTURA_POR_MESA = 263;
	
	public static final int ABRIR_VCERRAR_FACTURA = 2700;
	public static final int CERRAR_FACTURA = 271;
	public static final int CERRAR_FACTURA_OK = 272;
	public static final int CERRAR_FACTURA_KO = 273;
	
	public static final int ABRIR_VANIADIR_MENUS_FACTURA = 2800;
	public static final int ELEGIR_MENUS_FACTURA = 286;
	public static final int ANIADIR_MENUS_FACTURA = 281;
	public static final int ANIADIR_MENUS_FACTURA_OK = 282;
	public static final int ANIADIR_MENUS_FACTURA_KO = 283;
	
	public static final int ABRIR_VELIMINAR_MENUS_FACTURA = 2900;
	public static final int ELIMINAR_MENUS_FACTURA = 291;
	public static final int ELIMINAR_MENUS_FACTURA_OK = 292;
	public static final int ELIMINAR_MENUS_FACTURA_KO = 293;
	
	// EMPLEADO
	public static final int ABRIR_VEMPLEADO = 300;
	
	public static final int ABRIR_VMODIFICAR_EMPLEADO = 3100;
	public static final int ABRIR_VMODIFICAR_EMPLEADO2 = 3101;
	public static final int MODIFICAR_EMPLEADO = 310;
	public static final int MODIFICAR_EMPLEADO2 = 312;
	public static final int MODIFICAR_EMPLEADO_OK = 311;
	public static final int MODIFICAR_EMPLEADO_KO = 313;
	public static final int MODIFICAR_EMPLEADO_DNI_YA_EXISTE= 314;
	public static final int MODIFICAR_EMPLEADO_DATOS_INCORRECTOS= 315;
	
	public static final int ABRIR_VALTA_EMPLEADO = 3200;
	public static final int ALTA_EMPLEADO = 320;
	public static final int ALTA_EMPLEADO_OK = 321;
	public static final int ALTA_EMPLEADO_KO = 322;
	public static final int ALTA_EMPLEADO_DNI_YA_EXISTE= 323;
	public static final int ALTA_EMPLEADO_DATOS_INCORRECTOS = 324;
	
	public static final int ABRIR_VBAJA_EMPLEADO = 3300;
	public static final int BAJA_EMPLEADO = 330;
	public static final int BAJA_EMPLEADO_OK = 331;
	public static final int BAJA_EMPLEADO_KO = 332;
	public static final int BAJA_EMPLEADO_ID_INEXISTENTE= 333;
	public static final int BAJA_EMPLEADO_YA_INACTIVO= 334;
	
	public static final int ABRIR_VMOSTRAR_UN_EMPLEADO = 3400;
	public static final int MOSTRAR_UN_EMPLEADO = 340;
	public static final int MOSTRAR_UN_EMPLEADO_OK = 341;
	public static final int MOSTRAR_UN_EMPLEADO_KO = 342;
	
	public static final int ABRIR_VMOSTRAR_EMPLEADO_TODOS = 3500;
	public static final int MOSTRAR_EMPLEADO_TODOS = 350;
	public static final int MOSTRAR_EMPLEADO_TODOS_OK = 351;
	public static final int MOSTRAR_EMPLEADO_TODOS_KO = 352;
	
	public static final int ABRIR_VMOSTRAR_EMPLEADO_RANGO = 3600;
	public static final int MOSTRAR_EMPLEADO_RANGO = 360;
	public static final int MOSTRAR_EMPLEADO_RANGO_OK = 361;
	public static final int MOSTRAR_EMPLEADO_RANGO_KO = 362;
	
	// INGREDIENTE
	public static final int ABRIR_VINGREDIENTE = 400;
	
	public static final int ABRIR_VMODIFICAR_INGREDIENTE = 4100;
	public static final int MODIFICAR_INGREDIENTE = 410;
	public static final int MODIFICAR_INGREDIENTE2 = 416;
	public static final int ABRIR_VMODIFICAR_INGREDIENTE2 = 417;
	public static final int MODIFICAR_INGREDIENTE_OK = 411;
	public static final int MODIFICAR_INGREDIENTE_KO= 415;
	public static final int MODIFICAR_INGREDIENTE_ID_INEXISTENTE = 412;
	public static final int MODIFICAR_INGREDIENTE_NOMBRE_YA_EXISTE = 413;
	public static final int MODIFICAR_INGREDIENTE_DATOS_INVALIDOS = 414;
	
	public static final int ABRIR_VALTA_INGREDIENTE = 4200;
	public static final int ALTA_INGREDIENTE = 420;
	public static final int ALTA_INGREDIENTE_OK = 421;
	public static final int ALTA_INGREDIENTE_KO = 422;
	public static final int ALTA_INGREDIENTE_YA_EXISTENTE = 423;
	public static final int ALTA_INGREDIENTE_DATOS_INVALIDOS = 424;
	
	public static final int ABRIR_VBAJA_INGREDIENTE = 4300;
	public static final int BAJA_INGREDIENTE = 430;
	public static final int BAJA_INGREDIENTE_OK = 431;
	public static final int BAJA_INGREDIENTE_KO = 432;
	public static final int BAJA_INGREDIENTE_ID_INEXISTENTE = 433;
	public static final int BAJA_INGREDIENTE_YA_INACTIVO = 434;
	public static final int BAJA_INGREDIENTE_VINCULADO_A_UN_PRODUCTO= 435;
	
	public static final int ABRIR_VMOSTRAR_UN_INGREDIENTE = 4400;
	public static final int MOSTRAR_UN_INGREDIENTE = 440;
	public static final int MOSTRAR_UN_INGREDIENTE_OK = 441;
	public static final int MOSTRAR_UN_INGREDIENTE_KO = 442;
	
	public static final int ABRIR_VMOSTRAR_INGREDIENTE_TODOS = 4500;
	public static final int MOSTRAR_INGREDIENTE_TODOS = 450;
	public static final int MOSTRAR_INGREDIENTE_TODOS_OK = 451;
	public static final int MOSTRAR_INGREDIENTE_TODOS_KO = 452;
	
	public static final int ABRIR_VMOSTRAR_UN_INGREDIENTE_POR_NOMBRE = 4600;
	public static final int MOSTRAR_UN_INGREDIENTE_POR_NOMBRE = 460;
	public static final int MOSTRAR_UN_INGREDIENTE_POR_NOMBRE_OK = 461;
	public static final int MOSTRAR_UN_INGREDIENTE_POR_NOMBRE_KO = 462;
	
	// MENU
	public static final int ABRIR_VMENU = 500;
	
	public static final int ABRIR_VMODIFICAR_MENU = 5100;
	public static final int ABRIR_VMODIFICAR_MENU2 = 5101;
	public static final int MODIFICAR_MENU = 510;
	public static final int MODIFICAR_MENU2 = 516;
	public static final int MODIFICAR_MENU_OK = 511;
	public static final int MODIFICAR_MENU_KO = 512;
	public static final int MODIFICAR_MENU_ID_INEXISTENTE = 513;
	public static final int MODIFICAR_MENU_NOMBRE_EXISTENTE = 514;
	public static final int MODIFICAR_MENU_DATOS_INCORRECTOS = 515;
	
	public static final int ABRIR_VALTA_MENU = 5200;
	public static final int ALTA_MENU = 520;
	public static final int ALTA_MENU_OK = 521;
	public static final int ALTA_MENU_KO = 522;
	public static final int ALTA_MENU_NOMBRE_MENU_YA_EXISTE = 523;
	public static final int ALTA_MENU_DATOS_INCORRECTOS = 524;
	
	public static final int ABRIR_VBAJA_MENU = 5300;
	public static final int BAJA_MENU = 530;
	public static final int BAJA_MENU_OK = 531;
	public static final int BAJA_MENU_KO = 532;
	public static final int BAJA_MENU_ID_INEXISTENTE = 533;
	public static final int BAJA_MENU_YA_INACTIVO = 534;
	
	public static final int ABRIR_VMOSTRAR_UN_MENU = 5400;
	public static final int MOSTRAR_UN_MENU = 540;
	public static final int MOSTRAR_UN_MENU_OK = 541;
	public static final int MOSTRAR_UN_MENU_KO = 542;
	public static final int MOSTRAR_PRODUCTOS_DE_UN_MENU = 543;
	
	public static final int ABRIR_VMOSTRAR_MENU_TODOS = 5500;
	public static final int MOSTRAR_MENU_TODOS = 550;
	public static final int MOSTRAR_MENU_TODOS_OK = 551;
	public static final int MOSTRAR_MENU_TODOS_KO = 552;
	
	public static final int ABRIR_VDESVINCULAR_PRODUCTO = 5900;
	public static final int DESVINCULAR_PRODUCTO = 5901;
	public static final int DESVINCULAR_PRODUCTO_OK = 5902;
	public static final int DESVINCULAR_PRODUCTO_KO = 5903;
	public static final int DESVINCULAR_PRODUCTO_NO_EXISTE_PRODUCTO = 5905;
	public static final int DESVINCULAR_PRODUCTO_NO_EXISTE_MENU = 5906;
	public static final int DESVINCULAR_PRODUCTO_NO_EXISTE_MENU_NI_PRODUCTO = 5907;
	public static final int DESVINCULAR_PRODUCTO_NO_VINCULADO = 5908;

	public static final int ABRIR_VVINCULAR_PRODUCTO = 5950;
	public static final int VINCULAR_PRODUCTO = 5951;
	public static final int VINCULAR_PRODUCTO_OK = 5952;
	public static final int VINCULAR_PRODUCTO_KO = 5953;
	public static final int VINCULAR_PRODUCTO_YA_VINCULADO = 5954;
	public static final int VINCULAR_PRODUCTO_NO_EXISTE_MENU = 5955;
	public static final int VINCULAR_PRODUCTO_NO_EXISTE_PRODUCTO = 5956;
	public static final int VINCULAR_PRODUCTO_NO_EXISTE_PRODUCTO_NI_MENU = 5957;
	
	public static final int ABRIR_VMOSTRAR_MENU_RANGO = 5960;
	public static final int MOSTRAR_MENU_RANGO = 5961;
	public static final int MOSTRAR_MENU_RANGO_OK = 5962;
	public static final int MOSTRAR_MENU_RANGO_KO = 5963;
	
	
	// PRODUCTO
	public static final int ABRIR_VPRODUCTO = 600;
	
	public static final int ABRIR_VMODIFICAR_PRODUCTO = 6100;
	public static final int MODIFICAR_PRODUCTO = 610;
	public static final int MODIFICAR_PRODUCTO2 = 616;
	public static final int MODIFICAR_PRODUCTO_OK = 611;
	public static final int MODIFICAR_PRODUCTO_KO = 612;
	public static final int MODIFICAR_PRODUCTO_ID_INEXISTENTE = 613;
	public static final int MODIFICAR_PRODUCTO_NOMBRE_YA_EXISTE = 614;
	public static final int MODIFICAR_PRODUCTO_DATOS_INVALIDOS = 615;
	public static final int ABRIR_VMODIFICAR_PRODUCTO2 = 617;
	public static final int MODIFICAR_PRODUCTO_DATOS_INCORRECTOS = 618;
	
	public static final int ABRIR_VALTA_PRODUCTO = 6200;
	public static final int ALTA_PRODUCTO = 620;
	public static final int ALTA_PRODUCTO_OK = 621;
	public static final int ALTA_PRODUCTO_KO = 622;
	public static final int ALTA_PRODUCTO_NOMBRE_YA_EXISTE= 623;
	public static final int ALTA_PRODUCTO_DATOS_INVALIDOS = 624;
	
	public static final int ABRIR_VBAJA_PRODUCTO = 6300;
	public static final int BAJA_PRODUCTO = 630;
	public static final int BAJA_PRODUCTO_OK = 631;
	public static final int BAJA_PRODUCTO_KO = 632;
	public static final int BAJA_PRODUCTO_YA_INACTIVO= 633;
	public static final int BAJA_PRODUCTO_ID_INEXISTENTE = 635;
	public static final int BAJA_PRODUCTO_VINCULADO_A_UN_MENU= 634;
	
	public static final int ABRIR_VMOSTRAR_UN_PRODUCTO = 6400;
	public static final int MOSTRAR_UN_PRODUCTO = 640;
	public static final int MOSTRAR_UN_PRODUCTO_OK = 641;
	public static final int MOSTRAR_UN_PRODUCTO_KO = 642;
	public static final int MOSTRAR_INGREDIENTES_DE_UN_PRODUCTO = 643;

	
	
	public static final int ABRIR_VMOSTRAR_PRODUCTO_TODOS = 6500;
	public static final int MOSTRAR_PRODUCTO_TODOS = 650;
	public static final int MOSTRAR_PRODUCTO_TODOS_OK = 651;
	public static final int MOSTRAR_PRODUCTO_TODOS_KO = 652;
	
	public static final int ABRIR_VDESVINCULAR_INGREDIENTE = 6900;
	public static final int DESVINCULAR_INGREDIENTE = 691;
	public static final int DESVINCULAR_INGREDIENTE_OK = 692;
	public static final int DESVINCULAR_INGREDIENTE_KO = 693;
	public static final int DESVINCULAR_INGREDIENTE_NO_PROD = 694;
	public static final int DESVINCULAR_INGREDIENTE_NO_INGR = 695;
	public static final int DESVINCULAR_INGREDIENTE_NO_EXISTE_PRODUCTO_NI_INGREDIENTE = 696;
	public static final int DESVINCULAR_INGREDIENTE_NO_VINCULADO = 697;
	
	public static final int ABRIR_VVINCULAR_INGREDIENTE = 61100;
	public static final int VINCULAR_INGREDIENTE = 6110;
	public static final int VINCULAR_INGREDIENTE_OK = 6111;
	public static final int VINCULAR_INGREDIENTE_KO = 6112;
	public static final int VINCULAR_INGREDIENTE_NO_EXISTEN = 6113;
	public static final int VINCULAR_INGREDIENTE_NO_PROD = 6114;
	public static final int VINCULAR_INGREDIENTE_NO_INGR = 6115;
	public static final int VINCULAR_INGREDIENTE_NO_EXISTE_PRODUCTO = 6116;
	public static final int VINCULAR_INGREDIENTE_NO_EXISTE_INGREDIENTE = 6117;
	public static final int VINCULAR_INGREDIENTE_YA_VINCULADO = 6118;

	public static final int ABRIR_VMOSTRAR_UN_PRODUCTO_POR_NOMBRE = 61200;
	public static final int MOSTRAR_UN_PRODUCTO_POR_NOMBRE = 6120;
	public static final int MOSTRAR_UN_PRODUCTO_POR_NOMBRE_OK = 6121;
	public static final int MOSTRAR_UN_PRODUCTO_POR_NOMBRE_KO = 6122;
	
	public static final int ABRIR_VCOMIDA = 700;

	public static final int ABRIR_VPRINCIPAL = 0;







}