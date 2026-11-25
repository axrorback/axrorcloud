<p align="center">
  <img src="https://media.axror.tech/d8a7293c-fc9c-44af-b84f-994bde484dfc.jpg" alt="AxrorCloud Banner" width="750" />
</p>

<h1 align="center">AxrorCloud — The HTTP Tunneling Tool</h1>

<p align="center">
  Expose your local server to the internet in seconds with a simple, lightweight CLI.
</p>

<p align="center">
  <a href="https://axror.cloud"><img src="https://img.shields.io/badge/Website-axror.cloud-0ea5e9?style=for-the-badge" alt="Website" /></a>
  <a href="https://github.com/axrorback/axrorcloud/releases"><img src="https://img.shields.io/badge/Release-v1.0.0-22c55e?style=for-the-badge" alt="Release" /></a>
  <a href="./LICENSE"><img src="https://img.shields.io/badge/License-MIT-6366f1?style=for-the-badge" alt="License" /></a>
</p>

---

### Feature Overview
- **Instant Public URLs** — Expose your local development server to the internet easily.
- **Access Anywhere** — Reach your local services, webhooks, and demos from any device.
- **Zero Complex Setup** — No router port-forwarding or firewall configurations required.
- **Custom Subdomains** — Pick your own subdomain (`*.axror.cloud`) for predictable URLs.
- **Lightweight CLI** — Fast, single-binary command-line interface written in Go.

---

### Installation & Updating

<details open>
<summary><b>macOS and Linux</b></summary>

```bash
curl -fsSL [https://github.com/axrorback/axrorcloud/releases/download/v1.0.0/install.sh](https://github.com/axrorback/axrorcloud/releases/download/v1.0.0/install.sh) | sudo bash
```
</details>

<details>
<summary><b>Windows</b></summary>

Download the latest `.exe` binary from the [Releases page](https://github.com/axrorback/axrorcloud/releases/tag/v1.0.0).
</details>

---

### Usage

**1. Authenticate**  
Obtain your personal auth token by logging in at [axror.cloud](https://axror.cloud/):
```bash
axrorcloud --auth <AUTH_TOKEN>
```

**2. Expose a local port**  
Replace `<YOUR_PORT>` with the local port your app is running on (e.g., `8000`, `3000`, `8080`):
```bash
axrorcloud --port <YOUR_PORT>
```

**3. Use a custom subdomain**  
```bash
axrorcloud --port <YOUR_PORT> --sd <YOUR_SUBDOMAIN>
```
Example:
```bash
axrorcloud --port 8000 --sd myapp
```
> Your local app will be available at `https://myapp.axror.cloud/`.  
> Press **`Ctrl + C`** in the terminal at any time to stop the tunnel.

---

### Other Options

Show installed CLI version:
```bash
axrorcloud --version
```

Show help information:
```bash
axrorcloud --help
```

---

<p align="center">
  Built and maintained by <a href="https://axror.cloud"><b>AxrorCloud</b></a>
</p>