<h1 align="center">🏎️ VUELTA F1NAL - Full Stack Project</h1>

<p align="center">
  <img src="./public/logo_oficial.png" alt="Vuelta F1nal Logo" width="200" height="200">
</p>

<div align="center">
  <a href="https://github.com/agussantinelli/VUELTA-F1NAL" target="_blank">
    <img src="https://img.shields.io/badge/💻%20MonoRepo%20VUELTA%20F1NAL-FF1801?style=for-the-badge&logo=github&logoColor=white" alt="MonoRepo Vuelta F1nal"/>
  </a>
  <a href="https://github.com/agussantinelli" target="_blank">
    <img src="https://img.shields.io/badge/👤%20Agustín%20Santinelli-agussantinelli-000000?style=for-the-badge&logo=github&logoColor=white" alt="Agus"/>
  </a>
</div>

<div align="center">
  <img src="https://img.shields.io/badge/Kotlin-1.9.23-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin Badge"/>
  <img src="https://img.shields.io/badge/JetPack_Compose-BOM_2024.02.01-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white" alt="Compose Badge"/>
  <img src="https://img.shields.io/badge/Ktor-2.3.10-08c3d4?style=for-the-badge&logo=ktor&logoColor=white" alt="Ktor Badge"/>
  <img src="https://img.shields.io/badge/Gradle-8.7-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle Badge"/>
  <img src="https://img.shields.io/badge/Material%20Design%203-v1.11.0-7F52FF?style=for-the-badge&logo=materialdesign&logoColor=white" alt="Material 3 Badge"/>
  <img src="https://img.shields.io/badge/Android-SDK_34-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android Badge"/>
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-IDE-000000?style=for-the-badge&logo=intellijidea&logoColor=white" alt="IntelliJ IDEA Badge"/>
</div>

<div align="center">
  <img src="https://img.shields.io/badge/Copyright-All_Rights_Reserved-red?style=for-the-badge&logo=copyright&logoColor=white" alt="Copyright Badge"/>
</div>
<hr>

<h2>🎯 Objetivo del Proyecto</h2>

<p>
  <strong>VUELTA F1NAL</strong> es una plataforma integral de alto rendimiento para entusiastas de la <strong>Fórmula 1</strong>. Este ecosistema unifica décadas de historia estadística con telemetría en tiempo real, todo impulsado por un motor de predicción avanzado. 
</p>

<p>
  La arquitectura permite una sincronización perfecta entre el rigor del procesamiento de datos en el servidor y una experiencia de usuario fluida y moderna en dispositivos móviles.
</p>

<hr>

<h2>🛠️ Stack Tecnológico</h2>

<table>
  <thead>
    <tr>
      <th align="left">Categoría</th>
      <th align="left">Tecnología</th>
      <th align="left">Propósito</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>🎯 Core</strong></td>
      <td>Kotlin 1.9.23</td>
      <td>Lenguaje principal y lógica compartida multiplataforma.</td>
    </tr>
    <tr>
      <td><strong>⚙️ Backend</strong></td>
      <td>Ktor 2.3.10</td>
      <td>Motor asíncrono para APIs, WebSockets y Server-Side.</td>
    </tr>
    <tr>
      <td><strong>📱 Frontend</strong></td>
      <td>Jetpack Compose + Material 3</td>
      <td>UI declarativa nativa para una experiencia Android fluida.</td>
    </tr>
    <tr>
      <td><strong>🏗️ Build System</strong></td>
      <td>Gradle 8.7</td>
      <td>Gestión modular de dependencias y ciclos de compilación.</td>
    </tr>
    <tr>
      <td><strong>💾 Persistencia</strong></td>
      <td>SQLDelight / Room</td>
      <td>Gestión de tipos seguros para bases de datos locales y remotas.</td>
    </tr>
    <tr>
      <td><strong>🔌 Comunicación</strong></td>
      <td>Ktor Client + Serialization</td>
      <td>Consumo de datos y parseo JSON optimizado para Kotlin.</td>
    </tr>
    <tr>
      <td><strong>🏗️ Build System</strong></td>
      <td>Gradle</td>
      <td>Automatización de compilación y gestión modular de dependencias.</td>
    </tr>
    <tr>
      <td><strong>💻 Tooling</strong></td>
      <td>IntelliJ IDEA</td>
      <td>Entorno de desarrollo (IDE) optimizado para el ecosistema Kotlin.</td>
    </tr>
  </tbody>
</table>

<hr>

<h2>📱 Experiencia de Usuario (Frontend)</h2>

<p>La interfaz en <code>composeApp/</code> traduce la complejidad de los datos en una narrativa visual:</p>

<table>
  <thead>
    <tr>
      <th align="left">Módulo UI</th>
      <th align="left">Funcionalidad</th>
      <th align="left">Estado</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>Resultados Globales</strong></td>
      <td>Visualización de posiciones, tiempos y escuderías por GP.</td>
      <td>🚀 Operativo</td>
    </tr>
    <tr>
      <td><strong>Top Speeds Analysis</strong></td>
      <td>Telemetría de velocidades máximas alcanzadas y vueltas récord.</td>
      <td>🚀 Operativo</td>
    </tr>
    <tr>
      <td><strong>Dashboard Real-Time</strong></td>
      <td>Seguimiento de sesiones en vivo y cronometrajes dinámicos.</td>
      <td>⏳ Planeado</td>
    </tr>
  </tbody>
</table>

<hr>

<h2>✨ Arquitectura Limpia Reactiva (Frontend)</h2>

<p>
  El frontend de <code>composeApp/</code> sigue una arquitectura limpia y reactiva, inspirada en los principios de Clean Architecture y MVI (Model-View-Intent), adaptada para Jetpack Compose.
</p>

<ul>
  <li><b>Capa de Datos (Data Layer):</b> Responsable de la obtención y persistencia de datos. Incluye implementaciones de repositorios, fuentes de datos remotas (APIs) y locales (bases de datos). Utiliza DTOs para la serialización/deserialización.</li>
  <li><b>Capa de Dominio (Domain Layer):</b> Contiene la lógica de negocio pura e independiente de cualquier framework. Define los modelos de negocio (entidades) y las interfaces de los repositorios (contratos). Los casos de uso (Use Cases) orquestan las operaciones de negocio.</li>
  <li><b>Capa de Presentación (UI Layer):</b> Encargada de mostrar la interfaz de usuario y manejar las interacciones del usuario. Se compone de:
    <ul>
      <li><b>Views (Composables):</b> Elementos UI declarativos que reaccionan a los cambios de estado.</li>
      <li><b>ViewModels:</b> Gestionan el estado de la UI, exponen datos a las Views y manejan la lógica de presentación, interactuando con los casos de uso del dominio.</li>
      <li><b>State:</b> Representación inmutable del estado de la UI, expuesto a través de <code>StateFlow</code> o <code>MutableStateFlow</code>.</li>
    </ul>
  </li>
</ul>

<p>
  Esta separación de responsabilidades garantiza un código modular, testeable y fácil de mantener, promoviendo la reactividad y la unidireccionalidad del flujo de datos.
</p>

<hr>

<h2>🧠 El Cerebro: Motor de Predicción (Backend)</h2>

<p>
  El núcleo lógico reside en <code>engine/</code>, diseñado para transformar Big Data histórico en insights accionables:
</p>

<ul>
  <li><b>Telemetría Analítica:</b> Procesamiento y entrega de velocidades máximas y vueltas récord por piloto (<code>/api/max-speed</code>).</li>
  <li><b>F1 Data Logic:</b> Orquestación de resultados históricos y cronometrajes sincronizados (<code>/api/results</code>).</li>
  <li><b>Mapping & Transport:</b> Transformación de datos crudos en DTOs optimizados para el consumo móvil.</li>
  <li><b>Engine Scalability:</b> Arquitectura de rutas modulares preparada para la ingesta masiva de sensores en tiempo real.</li>
</ul>

<hr>

<h2>📂 Estructura del Proyecto</h2>

<pre><code>VUELTA-F1NAL/
├── composeApp/                                       # Frontend: Aplicación Android (Jetpack Compose)
│   ├── src/main/java/com/vueltaf1nal/app/
│   │   ├── data/                                     # Capa de Datos: DTOs, Repositorios (Impl), APIs
│   │   │   ├── models/api/                           # DTOs (Serialización)
│   │   │   ├── remote/                               # Servicios Ktor (NetworkClient, ResultsService, TopSpeedsService)
│   │   │   └── repository/                            # Implementaciones de Repositorios (ResultsRepositoryImpl, etc.)
│   │   ├── domain/                                   # Capa de Dominio: Modelos, Interfaces
│   │   │   ├── models/                               # Modelos de Negocio
│   │   │   └── repository/                            # Interfaces de Repositorios (Abstracción)
│   │   ├── ui/                                       # Capa de UI: Screens, ViewModels, Theme
│   │   │   ├── screens/                              # Composable Screens (ResultListScreen, TopSpeedsScreen)
│   │   │   ├── theme/                                # Design System (Color, Type, Theme)
│   │   │   └── viewmodel/                            # Gestión de Estado (MainViewModel)
│   │   └── MainActivity.kt                           # Punto de entrada (Host de Navegación)
│   └── src/main/res/                                 # Recursos Android (layouts, themes, drawables)
├── engine/                                           # Backend: Servidor Ktor (Kotlin JVM)
│   ├── src/main/kotlin/
│   │   ├── com/vueltaf1nal/                          # Paquete Principal
│   │   │   ├── data/                                 # Capa de Datos: DTOs, Repositorios (Impl), Mappers
│   │   │   │   ├── dtos/                             # Serialización (API Contracts)
│   │   │   │   ├── mappers/                          # Transformación (DTO <-> Domain)
│   │   │   │   └── repositories/                      # Lógica de Datos persistente
│   │   │   ├── domain/                               # Capa de Dominio: Modelos, Lógica Pura
│   │   │   │   └── models/                           # Entidades de Negocio
│   │   │   └── routes/                               # Capa de Entrada: Ktor Routes (Endpoints)
│   │   ├── Application.kt                            # Punto de entrada (Config Server)
│   │   └── Routing.kt                                # Configuración de Rutas y Repositorios
│   └── src/main/resources/                           # Recursos (Resources, Config)
├── build.gradle.kts                                  # Configuración de compilación raíz
├── settings.gradle.kts                               # Definición de módulos del proyecto
└── README.md                                         # Documentación principal del ecosistema
</code></pre>

<hr>

<h2>🧠 Skills Especializadas</h2>

<p>Este proyecto utiliza un sistema de <strong>Skills</strong> (guías avanzadas) para asegurar que cualquier desarrollo (humano o por IA) siga estrictamente los estándares arquitectónicos del proyecto:</p>

<ul>
    <li><strong>🏗️ Arquitectura Modular:</strong> Reglas sobre la separación de capas (Data, Domain, UI) y el principio de <b>Granularidad (Uno por Clase)</b> para evitar dependencias cruzadas.</li>
    <li><strong>📱 Compose State Management:</strong> Gestión de estado reactivo con <code>MutableStateFlow</code>, State Hoisting y arquitectura UDF (Unidirectional Data Flow).</li>
    <li><strong>🌊 Flow & Coroutines:</strong> Estándar para operaciones asíncronas, manejo de scopes y recolección de flujos segura con el ciclo de vida de Android.</li>
    <li><strong>📐 Adaptive UI:</strong> Estrategias para diseños responsivos utilizando <code>WindowSizeClass</code> para (Compact, Medium, Expanded).</li>
    <li><strong>🧹 Clean Structure (Frontend):</strong> Organización de paquetes en <code>composeApp/</code> y estándares de nomenclatura para componentes y ViewModels.</li>
    <li><strong>⚙️ Clean Structure (Backend):</strong> Organización modular del <code>engine/</code> (Routes -> Repositories -> Mappers -> DTOs).</li>
    <li><strong>🚀 Ktor Engine Logic:</strong> Normas para el desarrollo del motor, incluyendo serialización eficiente y aislamiento de la lógica de predicción.</li>
    <li><strong>🛠️ Skill Generator:</strong> Herramienta para la creación de nuevas guías que expandan el conocimiento operativo del sistema.</li>
</ul>

<hr>

<h2>🚀 Ejecución desde IntelliJ IDEA</h2>

<p>Para poner en marcha el ecosistema <strong>VUELTA F1NAL</strong> desde IntelliJ, sigue estos pasos:</p>

<ol>
  <li><strong>Sincronización Inicial:</strong>
    <ul>
      <li>Haz clic en el icono del elefante con flechas azules (<strong>Sync Project with Gradle Files</strong>) para asegurar que todos los módulos y dependencias estén correctamente cargados.</li>
    </ul>
  </li>
  <li><strong>Ejecutar el Engine (Backend):</strong>
    <ul>
      <li>En el menú desplegable de configuraciones de ejecución (esquina superior derecha), selecciona <code>engine [run]</code>.</li>
      <li>Haz clic en el botón de <strong>Run (Play verde)</strong>. El servidor Ktor se iniciará en <code>http://localhost:8080</code>.</li>
      <li><i>Alternativa:</i> Abre <code>engine/src/main/kotlin/com/vueltaf1nal/Application.kt</code> y haz clic en el icono de Play verde al lado de la función <code>main</code>.</li>
    </ul>
  </li>
  <li><strong>Ejecutar la App (Frontend):</strong>
    <ul>
      <li>Una vez que el motor esté corriendo, selecciona <code>composeApp</code> en el menú de configuraciones.</li>
      <li>Haz clic en el botón de <strong>Run (Play verde)</strong> para compilar y desplegar la app en tu dispositivo o emulador Android preferido.</li>
    </ul>
  </li>
</ol>

<p><i>Tip: Puedes monitorear los logs del servidor y de la app simultáneamente desde las pestañas de <strong>Run</strong> y <strong>Logcat</strong> de IntelliJ.</i></p>

<hr>

<h2>📬 Contacto</h2>

<div align="center">
  <img src="https://img.shields.io/badge/Autor-Agustín%20Santinelli-2b3137?style=for-the-badge&logo=person&logoColor=white" alt="Autor"/>
  <a href="mailto:agustinsantinelli@gmail.com">
    <img src="https://img.shields.io/badge/Email-agustinsantinelli%40gmail.com-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Email"/>
  </a>
</div>

<hr>

<h2 align="left">⚖️ Licencia y Propiedad Intelectual</h2>

<p align="left">
  Este proyecto es <b>propiedad intelectual privada</b> de Agustín Santinelli. No se otorga ninguna licencia de uso abierto. Puedes consultar los términos detallados en el archivo 
  <a href="LICENSE"><code>LICENSE</code></a> incluido en este repositorio.
</p>

<p align="left">
  <i>
    ⚠️ <b>Restricción Firme:</b> Queda terminantemente prohibida la copia, reproducción, distribución o modificación de este código sin autorización expresa del autor. Este repositorio se publica exclusivamente como exhibición de portafolio profesional.
  </i>
</p>

<hr>

<h2 align="left">🚫 Copyright Total</h2>

<p align="left">
  Este proyecto es propiedad intelectual exclusiva de <b>Agustín Santinelli</b>. No se aceptan contribuciones externas o forks para su uso público sin previo acuerdo por escrito.
</p>

<p align="left">
  Si tienes sugerencias directas o deseas explorar colaboraciones comerciales, por favor contacta al autor: 
  <a href="mailto:agustinsantinelli@gmail.com">agustinsantinelli@gmail.com</a>.
</p>

<hr>

<div align="center">
  <p><em>VUELTA F1NAL – Donde la historia se encuentra con el futuro.</em></p>
</div>
