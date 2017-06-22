<!DOCTYPE html>
<html>
    
<!-- Mirrored from 10.200.38.42/nickel/@projetos/@GUI_mockup/TF gui mockup www.104 php/@GPON hg/pt_BR/about-power-box.php by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 22 May 2017 12:11:34 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
    
<title>Vivo</title>
 
<meta charset="UTF-8">
<meta name="description" content="" />
<meta name="keywords" content="" />
 
<link rel="stylesheet" type="text/css" href="../assets/_css/gateway.css"/>
<link rel="stylesheet" type="text/css" href="../assets/_js/fancybox/jquery.fancybox.css" />
 
<script type="text/javascript" src="../assets/_js/jquery-1.5.min.js"></script>
<script type="text/javascript" src="../assets/_js/fancybox/jquery.fancybox.pack.js"></script>
<script type="text/javascript" src="../assets/_js/qrcode.min.js"></script>
 
        <style>
            li.led {
                border-bottom: 1px solid rgba(255, 255, 255, .4);
                -webkit-background-clip: padding-box; /* for Safari */
                background-clip: padding-box; /* for IE9+, Firefox 4+, Opera, Chrome */
                margin-top:7px;
            }
            
            svg.led{
                margin-right: 10px;
                width: 10px;
                height: 10px;
                display: none;
            }
            
         </style>
        <script>
            $(document).ready(function(){
            
                $('li.led').hover(
                  function() { $( this ).find( "svg" ).show();},
                  function() { $( this ).find( "svg" ).hide(); }
                );
            
            });
        </script>
    </head>
<body>
     
    <div id="header-gateway">
 
        <div class="wrap text-right">
 
            <a href="http://www.vivo.com.br/"><img src="../assets/_images/gateway/logo-gvt.png" alt="Vivo" class="left" border="0"></a>
 
            <p class="top-menu-language"><a href="http://10.200.38.42/nickel/@projetos/@GUI_mockup/TF gui mockup www.104 php/@GPON hg/en_US/">English</a> | <a href="index-2.html">Português</a></p>
            <p class="top-menu-language"><a href="login.html"><strong>Sair</strong></a></p>
 
        </div>
 
        <div class="clear"></div>
 
    </div><!--header-gateway-->
 
 
    
        <div id="content">
            <div class="wrap">
                <div id="conteudo-gateway">
 
                
 
 <div class="col-192 left">
 
    <script> // Nav Menu - Actions
        $(document).ready(function () {
            $("#accordion a.item").click(function () {
                $("#accordion li").children("ul").slideUp("fast");	
                $("#accordion a").removeClass("active");
                $(this).addClass("active");
                $(this).siblings("ul").slideDown("fast");	
                return false;
            });
        });
    </script>
 
        <ul id="accordion">
            <li>
                <a class="menuactive" href="index.html">Status</a>
            </li>
 
            <li>
                <a href="#" class="item configuracoes" rel="category">Configurações</a>
                <ul>
                    <li><a href="settings-internet.html">Internet</a></li>
                    <li><a class="active" href="settings-local-network.html">Rede Local</a></li>
                    <li><a href="settings-wireless-network.html">Rede Wi-Fi 2,4 GHz</a></li>
                    <li><a href="settings-wireless-network-5g.html">Rede Wi-Fi 5 GHz</a></li>
                    <li><a href="settings-games.html">Jogos & Aplicativos</a></li>
                    <li><a href="settings-firewall.html">Firewall</a></li>
                    <li><a href="settings-usb.html">Dispositivos USB</a></li>
                    <li><a href="settings-wan-mode.html">Modo da WAN</a></li>
                </ul>
            </li>
 
            <li>
                <a href="#" class="item gerenciamento" rel="gerenciamento">Gerenciamento</a>
                <ul>
                    <li><a href="device-management-language.html">Idioma</a></li>
                    <li><a href="device-management-account-settings.html">Alterar Senha</a></li>
                    <li><a href="device-management-resets.html">Reiniciar</a></li>
                    <li><a href="device-management-statistics.html">Estatísticas</a></li>
                    <li><a href="device-management-system-logs.html">Histórico</a></li>
                    <li><a href="device-management-utilities-internet.html">Ferramentas</a></li>
                </ul>
            </li>
 
            <li>
                <a href="about-power-box.html">Sobre o Dispositivo</a>
            </li>
 
        </ul>
 
    </div><!--col-192-->
 
                    <div id='content_of_page'>
                        
                        <div class="col-722 left">
			
                            <h3 class="azul-2 text-up">Sobre o Vivo Box</h3>
 
                                <table class="gatewayTable" id="table_model" cellpadding="0" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th colspan="4" class="firstChild">Informações do Dispositivo</th>
                                    </tr>
                                </thead>
                            <tbody>
                                <tr class="odd">
                                <td class="firstChild"><strong>Fabricante:</strong></td><td>$Vendor</td>
                                <td class="firstChild"><strong>Modelo:</strong></td><td>$Model</td>
                                </tr>    
                                <tr class="even">
                                <td class="firstChild"><strong>Versão do Software:</strong></td><td>FAST2764_v82M0</td>
                                <td class="firstChild"><strong>Versão do Hardware:</strong></td><td>2764-0000000-001</td>
                                </tr>
                                <tr class="odd">
                                <td class="firstChild"><strong>Número de Série:</strong></td><td>NQ1214107324853</td>
                                <td class="firstChild"><strong>Número de Série GPON:</strong></td><td>SAGE89343245</td>
                                </tr>
                                </tr>    
                                <tr class="even">
                                <td class="firstChild"><strong>Endereço MAC da WAN:</strong></td><td>00:0C:C3:3A:3C:6C</td>
                                <td class="firstChild"><strong>Endereço MAC da LAN:</strong></td><td>200:0C:C3:3A:3C:6D</td>
                                </tr>
 
                                </table>
 
                            <div class="clear"></div>
 
                            <img src="../assets/_images/gateway/sobre-power-box.jpg" alt="Power Box GVT" class="left" width="134">
 
                            <table class="gatewayTable" cellpadding="0" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th width="86">LED</th>
                                        <th class="lastChild" width="396">O que as luzes significam?</th>
                                    </tr>
                                </thead>
                            <tbody>
                                <tr class="odd">
                                <td>Ligado</td>
                                <td>
                                    <ul>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Fixo Verde:</strong> Vivo Box está pronto para uso.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                  <animate attributeName="fill" 
                                                  values="white;green;white"       
                                                  dur="0.5s" repeatCount="indefinite"
                                                  />
                                                </circle>
                                            </svg>
                                            <strong>Piscando Verde:</strong> Vivo Box está executando o processo de inicialização.
                                        </li>
                                        <li class="led">
                                            <svg class="led" id="blink-red"> 
                                                <circle r="50%" cx="50%" cy="50%"  
                                                        fill="darkred"
                                                        stroke="darkred"
                                                        fill-opacity="0.5" 
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                  <animate attributeName="fill" 
                                                  values="white;red;white"       
                                                  dur="0.5s" repeatCount="indefinite"
                                                  />
                                                </circle>
                                            </svg>
                                            <strong>Piscando Vermelho:</strong> Processo de Atualização. Não desligue ou reinicie!
                                        </li>
                                        <li class=" led lastChild">
                                             <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%"  
                                                        fill="#f9f9f9"
                                                        stroke="darkgreen"
                                                        fill-opacity="0.5" 
                                                        stroke-width="7%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Desligado:</strong> Vivo Box está desligado.
                                        </li>
                                    </ul>	
                                </td>
                                </tr>    
                                <tr class="even">
                                    <td>Sincronismo</td>
                                    <td>
                                        <ul>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Fixo Verde:</strong> Vivo Box está sincronizado através da WAN Ethernet ou DSL.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                  <animate attributeName="fill" 
                                                  values="white;green;white"       
                                                  dur="0.5s" repeatCount="indefinite"
                                                  />
                                                </circle>
                                            </svg>
                                            <strong>Piscando Verde:</strong> Vivo Box está tentando sincronizar.
                                        </li>
                                        <li class="led lastChild">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%"  
                                                        fill="#f9f9f9"
                                                        stroke="darkgreen"
                                                        fill-opacity="0.5" 
                                                        stroke-width="7%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Desligado:</strong> Interface DSL interface está desabilitada ou sem conectividade.
                                        </li>
                                        </ul>
                                    </td>
                                </tr>  
                                <tr class="odd">
                                    <td>Internet</td>
                                    <td>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Fixo Verde:</strong> Vivo Box recebeu endereço de IP e pode navegar na Internet.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                  <animate attributeName="fill" 
                                                  values="white;green;white"       
                                                  dur="0.5s" repeatCount="indefinite"
                                                  />
                                                </circle>
                                            </svg>
                                            <strong>Piscando Verde:</strong> Vivo Box está tentando autenticar e receber endereço IP.
                                        </li>
                                        <li class="led lastChild">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%"  
                                                        fill="#f9f9f9"
                                                        stroke="darkgreen"
                                                        fill-opacity="0.5" 
                                                        stroke-width="7%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Desligado:</strong> Vivo Box em modo Bridge sem sessão de internet estabelecida.
                                        </li>
                                        </ul>
                                    </td>
                                </tr>  
                                <tr class="even">
                                    <td>HPNA</td>
                                    <td>
                                        <ul>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Fixo Verde:</strong> A rede HPNA está habilitada e possui outros nós conectados.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                  <animate attributeName="fill" 
                                                  values="white;green;white"       
                                                  dur="0.5s" repeatCount="indefinite"
                                                  />
                                                </circle>
                                            </svg>
                                            <strong>Piscando Verde:</strong> A rede HPNA está recebendo ou transmitindo dados.
                                        </li>
                                        <li class="led lastChild">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%"  
                                                        fill="#f9f9f9"
                                                        stroke="darkgreen"
                                                        fill-opacity="0.5" 
                                                        stroke-width="7%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Desligado:</strong> A interface HPNA está desabilitada ou não possui cabo conectado.
                                        </li>
                                        </ul>
                                    </td>
                                </tr>
                                <tr class="odd">
                                    <td>Qualidade HPNA</td>
                                    <td>
                                    <ul>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Fixo Verde:</strong> A rede HPNA apresenta boa qualidade.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="orange"
                                                        stroke="orange"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Fixo Laranja:</strong> A rede HPNA apresenta qualidade média.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="red"
                                                        stroke="red"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Fixo Vermelho:</strong>  A rede HPNA apresenta má qualidade.
                                        </li>
                                        <li class="led lastChild">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%"  
                                                        fill="#f9f9f9"
                                                        stroke="darkgreen"
                                                        fill-opacity="0.5" 
                                                        stroke-width="7%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Desligado:</strong> A interface HPNA está desabilitada ou não possui cabo conectado.
                                        </li>
                                    </ul>
                                    </td>
                                </tr>
                                <tr class="even">
                                    <td>TV</td>
                                    <td>
                                        <ul>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Fixo Verde:</strong> Vivo Box recebeu um endereço IP do circuito de TV.
                                            </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                  <animate attributeName="fill" 
                                                  values="white;green;white"       
                                                  dur="0.5s" repeatCount="indefinite"
                                                  />
                                                </circle>
                                            </svg>
                                            <strong>Piscando Verde:</strong> Recebendo ou transmitindo dados no circuito de TV.
                                            </li>
                                        <li class="led lastChild">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%"  
                                                        fill="#f9f9f9"
                                                        stroke="darkgreen"
                                                        fill-opacity="0.5" 
                                                        stroke-width="7%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Desligado:</strong> Vivo Box não recebeu IP na interface de TV ou interface desabilitada.
                                            </li>
                                        </ul>
                                    </td>
                                </tr>
                                <tr class="odd">
                                    </td>
                                    <td>Wi-Fi</td>
                                    <td>
                                        <ul>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Fixo Verde:</strong> A interface Wi-Fi está habilitada.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                  <animate attributeName="fill" 
                                                  values="white;green;white"       
                                                  dur="0.5s" repeatCount="indefinite"
                                                  />
                                                </circle>
                                            </svg>
                                            <strong>Piscando Verde:</strong> A interface Wi-Fi está recebendo ou transmitindo dados.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="red"
                                                        stroke="red"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                  <animate attributeName="fill" 
                                                  values="white;red;white"       
                                                  dur="0.5s" repeatCount="indefinite"
                                                  />
                                                </circle>
                                            </svg>
                                            <strong>Piscando Vermelho:</strong> A negociação WPS está habilitada.
                                        </li>
                                        <li class="led lastChild">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%"  
                                                        fill="#f9f9f9"
                                                        stroke="darkgreen"
                                                        fill-opacity="0.5" 
                                                        stroke-width="7%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Desligado:</strong> A interface Wi-Fi está desabilitada.
                                        </li>
                                        </ul>
                                    </td>
                                </tr>  
                                <tr class="even">
                                    </td>
                                    <td>Telefone 1/2</td>
                                    <td>
                                        <ul>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Fixo Verde:</strong> A linha esta registrada, você está apto a receber e efetuar ligações.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%" 
                                                            fill="green"
                                                            stroke="green"
                                                            fill-opacity="0.5"
                                                            stroke-width="5%"
                                                            stroke-opacity="0.3"     >
                                                      <animate attributeName="fill" 
                                                      values="white;green;white"       
                                                      dur="0.5s" repeatCount="indefinite"
                                                      />
                                                </circle>
                                            </svg>
                                            <strong>Piscando Verde:</strong> O telefone está fora do gancho ou chamada em andamento.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%"  
                                                        fill="green"
                                                        stroke="green"
                                                        fill-opacity="0.5"
                                                        stroke-width="5%"
                                                        stroke-opacity="0.3"     >
                                                  <animate attributeName="fill" 
                                                  values="white;green;white"       
                                                  dur="0.2s" repeatCount="indefinite"
                                                  calcMode="discrete"
                                                  />
                                                </circle>
                                            </svg>
                                            <strong>Piscando Verde Rapidamente:</strong> Mensagem não lida na caixa postal.
                                        </li>
                                        <li class="led">
                                            <svg class="led"> 
                                            <circle r="50%" cx="50%" cy="50%" 
                                                    fill="green"
                                                    stroke="green"
                                                    fill-opacity="0.5" 
                                                    stroke-width="5%"
                                                    stroke-opacity="0.3"     >
                                              <animate attributeName="fill" 
                                              values="white;green;white;green;white;green;white;white;white;white"   
                                              dur="2.5s" repeatCount="indefinite"
                                              />
                                            </circle>
                                            </svg>
                                            <strong>Piscando Verde Rapidamente 3 vezes:</strong> Conta configurada, mas sem IP na interface VoIP.
                                        </li>
                                        <li class="led lastChild">
                                            <svg class="led"> 
                                                <circle r="50%" cx="50%" cy="50%"  
                                                        fill="#f9f9f9"
                                                        stroke="darkgreen"
                                                        fill-opacity="0.5" 
                                                        stroke-width="7%"
                                                        stroke-opacity="0.3"     >
                                                </circle>
                                            </svg>
                                            <strong>Desligado:</strong> A linha está desabilitada ou não consegue se registrar.
                                        </li>
                                        </ul>
                                    </td>
                                </tr>  
                              </tbody>
                            </table>
                            <table style="float:right; margin-right: 25px;" class="gatewayTable right" cellpadding="0" cellspacing="0">
                                <thead>
                                    <tr>
                                        <th width="86">Botão</th>
                                        <th class="lastChild" width="396">O que fazem os botões?</th>
                                    </tr>
                                </thead>
                                <tbody>
                                  <tr class="odd">
                                    <td>WPS</td>
                                    <td class="lastChild">
                                    Ao pressionar este botão, você irá habilitar por um breve instante a função WPS. 
                                    Isto permite que seus dispositivos Wi-Fi entrem na sua rede sem precisar digitar a senha. 
                                    </td>
                                  </tr> 
                                   <tr class="even">
                                    <td>Reconfigurar</td>
                                    <td class="lastChild">
                                     Ao manter este botão apertado, você irá restaurar a configuração de original de fábrica.
                                     Isto apaga toda personalização efetuada, incluindo nomes e senhas da rede Wi-Fi. 
                                    </td>
                                  </tr> 
                                </tbody>
                            </table>
 
                        </div><!--col-722-->
                        
                    </div> <!--contents_of_page-->
 
                    <div class="clear"></div>
 
                </div><!--conteudo-->
 
                <div class="clear"></div>
            </div><!--wrap-->	
        </div><!--content-->
 
</body>
 
<!-- Mirrored from 10.200.38.42/nickel/@projetos/@GUI_mockup/TF gui mockup www.104 php/@GPON hg/pt_BR/about-power-box.php by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 22 May 2017 12:11:34 GMT -->
</html>

