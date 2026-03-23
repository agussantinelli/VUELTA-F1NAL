<h1 align="center">🏎️ VUELTA F1NAL — Full Stack Project</h1>

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

<h2>🧠 El Cerebro: Motor de Predicción (Backend)</h2>

<p>
  El núcleo lógico reside en <code>engine/</code>, diseñado para transformar Big Data histórico en insights accionables:
</p>

<ul>
  <li><b>Análisis de Micro-Sectores:</b> Evaluación técnica de fortalezas de chasis vs motor.</li>
  <li><b>Factor Climatológico:</b> Algoritmos que ajustan el rendimiento según condiciones de pista.</li>
  <li><b>Fiabilidad Mecánica:</b> Modelos probabilísticos de DNF basados en desgaste de componentes.</li>
  <li><b>Data Ingestion:</b> Normalización de fuentes históricas (1950-Presente) y feeds de telemetría en vivo.</li>
</ul>

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
      <td><strong>Dashboard Real-Time</strong></td>
      <td>Seguimiento de sesiones en vivo y cronometrajes.</td>
      <td>⏳ Planeado</td>
    </tr>
    <tr>
      <td><strong>Predictor UI</strong></td>
      <td>Interfaz interactiva para visualizar probabilidades de podio.</td>
      <td>🚀 Prioridad</td>
    </tr>
    <tr>
      <td><strong>Archivo Histórico</strong></td>
      <td>Explorador de pilotos, constructores y circuitos.</td>
      <td>🛠️ En Diseño</td>
    </tr>
  </tbody>
</table>

<hr>

<h2>📂 Estructura del Monorepo</h2>

<p>El proyecto utiliza una estructura modular para maximizar la reutilización de código:</p>

<table>
  <thead>
    <tr>
      <th align="left">Módulo</th>
      <th align="left">Descripción</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>📂 engine/</code></td>
      <td><b>Backend Core:</b> Servidor Ktor encargado del procesamiento, predicciones y suministro de API.</td>
    </tr>
    <tr>
      <td><code>📂 composeApp/</code></td>
      <td><b>Frontend Android:</b> Aplicación nativa desarrollada con Jetpack Compose para una UI reactiva.</td>
    </tr>
  </tbody>
</table>

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
