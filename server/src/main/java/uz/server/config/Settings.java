package uz.server.config;

public class Settings {
    public static final String TIMEOUT_HTML = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>504 Gateway Timeout | axrorcloud</title>
                <link rel="icon" type="image/jpeg" href="https://media.axror.tech/d8a7293c-fc9c-44af-b84f-994bde484dfc.jpg" />
                <link rel="preconnect" href="https://fonts.googleapis.com" />
                <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
                <link href="https://fonts.googleapis.com/css2?family=JetBrains+Mono:wght@400;600;700&display=swap" rel="stylesheet" />
                <style>
                    :root {
                        --bg: #f5f7f9;
                        --card-bg: #ffffff;
                        --text: #24292f;
                        --text-muted: #656d76;
                        --primary: #1a7f37;
                        --danger: #cf222e;
                        --border: #d0d7de;
                        --terminal-head: #eef1f4;
                        --font-mono: 'JetBrains Mono', ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas, monospace;
                    }
                    * { box-sizing: border-box; margin: 0; padding: 0; }
                    body {
                        min-height: 100vh;
                        background-color: var(--bg);
                        color: var(--text);
                        font-family: var(--font-mono);
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        padding: 20px;
                        -webkit-font-smoothing: antialiased;
                    }
                    .terminal-window {
                        background: var(--card-bg);
                        border: 1px solid var(--border);
                        border-radius: 10px;
                        overflow: hidden;
                        box-shadow: 0 10px 30px rgba(0, 0, 0, 0.05);
                        max-width: 520px;
                        width: 100%;
                    }
                    .terminal-header {
                        background: var(--terminal-head);
                        padding: 12px 16px;
                        display: flex;
                        justify-content: space-between;
                        align-items: center;
                        border-bottom: 1px solid var(--border);
                    }
                    .terminal-dots { display: flex; gap: 6px; }
                    .dot { width: 10px; height: 10px; border-radius: 50%; }
                    .dot-1 { background: #ff5f56; }
                    .dot-2 { background: #ffbd2e; }
                    .dot-3 { background: #27c93f; }
                    .path-display { font-size: 0.75rem; color: var(--text-muted); }
                    .terminal-body { padding: 32px 28px; }
                    .error-code {
                        display: inline-block;
                        font-size: 0.78rem;
                        font-weight: 600;
                        color: var(--danger);
                        background: rgba(207, 34, 46, 0.08);
                        border: 1px solid rgba(207, 34, 46, 0.2);
                        padding: 3px 10px;
                        border-radius: 6px;
                        margin-bottom: 14px;
                    }
                    h1 {
                        font-size: 1.35rem;
                        font-weight: 700;
                        margin-bottom: 12px;
                        line-height: 1.3;
                    }
                    p {
                        font-size: 0.88rem;
                        color: var(--text-muted);
                        line-height: 1.6;
                        margin-bottom: 12px;
                    }
                    .btn-action {
                        display: inline-block;
                        margin-top: 14px;
                        padding: 9px 18px;
                        background: var(--text);
                        color: #ffffff;
                        text-decoration: none;
                        border-radius: 8px;
                        font-size: 0.85rem;
                        font-weight: 600;
                        transition: 0.2s ease;
                    }
                    .btn-action:hover {
                        background: var(--primary);
                        transform: translateY(-1px);
                    }
                </style>
            </head>
            <body>
                <div class="terminal-window">
                    <div class="terminal-header">
                        <div class="terminal-dots">
                            <div class="dot dot-1"></div>
                            <div class="dot dot-2"></div>
                            <div class="dot dot-3"></div>
                        </div>
                        <div class="path-display">axrorcloud@tunnel:~$ status</div>
                    </div>
                    <div class="terminal-body">
                        <span class="error-code">ERR_CONNECTION_TIMEOUT (504)</span>
                        <h1>Connection Timeout after 60 seconds</h1>
                        <p>It seems the connection to the local service has timed out.</p>
                        <p>Please check your network settings or try again later.</p>
                        <a href="https://axror.cloud" class="btn-action">Go to axrorcloud</a>
                    </div>
                </div>
            </body>
            </html>
            """;

    public static String NOT_RUNNING_APP_OF_CLIENT_HTML = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>502 Application Not Running | axrorcloud</title>
                <link rel="icon" type="image/jpeg" href="https://media.axror.tech/d8a7293c-fc9c-44af-b84f-994bde484dfc.jpg" />
                <link rel="preconnect" href="https://fonts.googleapis.com" />
                <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
                <link href="https://fonts.googleapis.com/css2?family=JetBrains+Mono:wght@400;600;700&display=swap" rel="stylesheet" />
                <style>
                    :root {
                        --bg: #f5f7f9;
                        --card-bg: #ffffff;
                        --text: #24292f;
                        --text-muted: #656d76;
                        --primary: #1a7f37;
                        --danger: #cf222e;
                        --border: #d0d7de;
                        --terminal-head: #eef1f4;
                        --font-mono: 'JetBrains Mono', ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas, monospace;
                    }
                    * { box-sizing: border-box; margin: 0; padding: 0; }
                    body {
                        min-height: 100vh;
                        background-color: var(--bg);
                        color: var(--text);
                        font-family: var(--font-mono);
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        padding: 20px;
                        -webkit-font-smoothing: antialiased;
                    }
                    .terminal-window {
                        background: var(--card-bg);
                        border: 1px solid var(--border);
                        border-radius: 10px;
                        overflow: hidden;
                        box-shadow: 0 10px 30px rgba(0, 0, 0, 0.05);
                        max-width: 520px;
                        width: 100%;
                    }
                    .terminal-header {
                        background: var(--terminal-head);
                        padding: 12px 16px;
                        display: flex;
                        justify-content: space-between;
                        align-items: center;
                        border-bottom: 1px solid var(--border);
                    }
                    .terminal-dots { display: flex; gap: 6px; }
                    .dot { width: 10px; height: 10px; border-radius: 50%; }
                    .dot-1 { background: #ff5f56; }
                    .dot-2 { background: #ffbd2e; }
                    .dot-3 { background: #27c93f; }
                    .path-display { font-size: 0.75rem; color: var(--text-muted); }
                    .terminal-body { padding: 32px 28px; }
                    .error-code {
                        display: inline-block;
                        font-size: 0.78rem;
                        font-weight: 600;
                        color: var(--danger);
                        background: rgba(207, 34, 46, 0.08);
                        border: 1px solid rgba(207, 34, 46, 0.2);
                        padding: 3px 10px;
                        border-radius: 6px;
                        margin-bottom: 14px;
                    }
                    h1 {
                        font-size: 1.35rem;
                        font-weight: 700;
                        margin-bottom: 12px;
                        line-height: 1.3;
                    }
                    p {
                        font-size: 0.88rem;
                        color: var(--text-muted);
                        line-height: 1.6;
                        margin-bottom: 12px;
                    }
                    .btn-action {
                        display: inline-block;
                        margin-top: 14px;
                        padding: 9px 18px;
                        background: var(--text);
                        color: #ffffff;
                        text-decoration: none;
                        border-radius: 8px;
                        font-size: 0.85rem;
                        font-weight: 600;
                        transition: 0.2s ease;
                    }
                    .btn-action:hover {
                        background: var(--primary);
                        transform: translateY(-1px);
                    }
                </style>
            </head>
            <body>
                <div class="terminal-window">
                    <div class="terminal-header">
                        <div class="terminal-dots">
                            <div class="dot dot-1"></div>
                            <div class="dot dot-2"></div>
                            <div class="dot dot-3"></div>
                        </div>
                        <div class="path-display">axrorcloud@tunnel:~$ status</div>
                    </div>
                    <div class="terminal-body">
                        <span class="error-code">ERR_LOCAL_SERVICE_DOWN (502)</span>
                        <h1>Application Not Running</h1>
                        <p>It seems the local application you're trying to access is currently not running.</p>
                        <p>Please check your local server status or contact support if the issue persists.</p>
                        <a href="https://axror.cloud" class="btn-action">Go to axrorcloud</a>
                    </div>
                </div>
            </body>
            </html>
            """;

    public static String TUNNEL_NOT_FOUND_HTML = """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>404 Tunnel Not Found | axrorcloud</title>
                <link rel="icon" type="image/jpeg" href="https://media.axror.tech/d8a7293c-fc9c-44af-b84f-994bde484dfc.jpg" />
                <link rel="preconnect" href="https://fonts.googleapis.com" />
                <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
                <link href="https://fonts.googleapis.com/css2?family=JetBrains+Mono:wght@400;600;700&display=swap" rel="stylesheet" />
                <style>
                    :root {
                        --bg: #f5f7f9;
                        --card-bg: #ffffff;
                        --text: #24292f;
                        --text-muted: #656d76;
                        --primary: #1a7f37;
                        --danger: #cf222e;
                        --border: #d0d7de;
                        --terminal-head: #eef1f4;
                        --font-mono: 'JetBrains Mono', ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas, monospace;
                    }
                    * { box-sizing: border-box; margin: 0; padding: 0; }
                    body {
                        min-height: 100vh;
                        background-color: var(--bg);
                        color: var(--text);
                        font-family: var(--font-mono);
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        padding: 20px;
                        -webkit-font-smoothing: antialiased;
                    }
                    .terminal-window {
                        background: var(--card-bg);
                        border: 1px solid var(--border);
                        border-radius: 10px;
                        overflow: hidden;
                        box-shadow: 0 10px 30px rgba(0, 0, 0, 0.05);
                        max-width: 520px;
                        width: 100%;
                        animation: fadeIn 0.4s ease-out;
                    }
                    @keyframes fadeIn {
                        from { opacity: 0; transform: translateY(-10px); }
                        to { opacity: 1; transform: translateY(0); }
                    }
                    .terminal-header {
                        background: var(--terminal-head);
                        padding: 12px 16px;
                        display: flex;
                        justify-content: space-between;
                        align-items: center;
                        border-bottom: 1px solid var(--border);
                    }
                    .terminal-dots { display: flex; gap: 6px; }
                    .dot { width: 10px; height: 10px; border-radius: 50%; }
                    .dot-1 { background: #ff5f56; }
                    .dot-2 { background: #ffbd2e; }
                    .dot-3 { background: #27c93f; }
                    .path-display { font-size: 0.75rem; color: var(--text-muted); }
                    .terminal-body { padding: 32px 28px; }
                    .error-code {
                        display: inline-block;
                        font-size: 0.78rem;
                        font-weight: 600;
                        color: var(--danger);
                        background: rgba(207, 34, 46, 0.08);
                        border: 1px solid rgba(207, 34, 46, 0.2);
                        padding: 3px 10px;
                        border-radius: 6px;
                        margin-bottom: 14px;
                    }
                    h1 {
                        font-size: 1.35rem;
                        font-weight: 700;
                        margin-bottom: 12px;
                        line-height: 1.3;
                    }
                    p {
                        font-size: 0.88rem;
                        color: var(--text-muted);
                        line-height: 1.6;
                        margin-bottom: 12px;
                    }
                    .btn-action {
                        display: inline-block;
                        margin-top: 14px;
                        padding: 9px 18px;
                        background: var(--text);
                        color: #ffffff;
                        text-decoration: none;
                        border-radius: 8px;
                        font-size: 0.85rem;
                        font-weight: 600;
                        transition: 0.2s ease;
                    }
                    .btn-action:hover {
                        background: var(--primary);
                        transform: translateY(-1px);
                    }
                </style>
            </head>
            <body>
                <div class="terminal-window">
                    <div class="terminal-header">
                        <div class="terminal-dots">
                            <div class="dot dot-1"></div>
                            <div class="dot dot-2"></div>
                            <div class="dot dot-3"></div>
                        </div>
                        <div class="path-display">axrorcloud@tunnel:~$ status</div>
                    </div>
                    <div class="terminal-body">
                        <span class="error-code">ERR_TUNNEL_NOT_FOUND (404)</span>
                        <h1>Tunnel Not Found</h1>
                        <p>It seems the tunnel you're trying to access does not exist or is currently unavailable.</p>
                        <p>Please verify the tunnel subdomain or contact support for assistance.</p>
                        <a href="https://axror.cloud" class="btn-action">Go to axrorcloud</a>
                    </div>
                </div>
            </body>
            </html>
            """;
}