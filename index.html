<!DOCTYPE html>
<html lang="fa" dir="rtl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <title>بازی من - صفحه ورود کاربر</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            user-select: none;
        }

        body {
            min-height: 100vh;
            background: url('https://cdn.imgurl.ir/uploads/z123067_IMG_20260511_174033_815.jpg') no-repeat center center fixed;
            background-size: cover;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            position: relative;
        }

        /* مدال انتخاب نام کاربری */
        .modal {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0,0,0,0.8);
            backdrop-filter: blur(12px);
            display: flex;
            justify-content: center;
            align-items: center;
            z-index: 1000;
        }

        .modal-content {
            background: #1e1e2f;
            padding: 2rem;
            border-radius: 2rem;
            text-align: center;
            color: white;
            box-shadow: 0 20px 35px rgba(0,0,0,0.5);
            width: 90%;
            max-width: 350px;
            border: 1px solid rgba(255,255,255,0.2);
        }

        .modal-content h2 {
            margin-bottom: 1.5rem;
            font-size: 1.8rem;
        }

        .modal-content input {
            width: 100%;
            padding: 12px 15px;
            border-radius: 50px;
            border: none;
            outline: none;
            font-size: 1rem;
            text-align: center;
            margin-bottom: 1rem;
            font-family: inherit;
        }

        .modal-content button {
            background: #ff9800;
            color: #1e1e2f;
            border: none;
            padding: 10px 20px;
            border-radius: 40px;
            font-size: 1.2rem;
            font-weight: bold;
            cursor: pointer;
            transition: 0.2s;
            width: 100%;
        }

        /* نوار بالایی شفاف - جواهر چپ، سکه راست */
        .top-bar {
            position: fixed;
            top: 0;
            left: 0;
            right: 0;
            background: rgba(0, 0, 0, 0.5);
            backdrop-filter: blur(12px);
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 12px 25px;
            z-index: 200;
            border-bottom: 1px solid rgba(255, 255, 255, 0.2);
            direction: ltr;
        }

        .currency-item {
            display: flex;
            align-items: center;
            gap: 8px;
            background: rgba(0, 0, 0, 0.4);
            padding: 6px 18px;
            border-radius: 50px;
            backdrop-filter: blur(4px);
        }

        .currency-emoji {
            font-size: 1.8rem;
            filter: drop-shadow(0 2px 4px rgba(0,0,0,0.3));
        }

        .currency-value {
            font-size: 1.3rem;
            font-weight: bold;
            color: #ffd966;
            text-shadow: 0 1px 2px black;
            letter-spacing: 1px;
        }

        /* پنل پروفایل کاربر */
        .user-panel {
            position: fixed;
            top: 85px;
            left: 20px;
            display: flex;
            align-items: center;
            z-index: 200;
            direction: ltr;
        }

        .avatar {
            width: 80px;
            height: 80px;
            border-radius: 50%;
            object-fit: cover;
            border: 3px solid #fff;
            box-shadow: 0 5px 12px rgba(0,0,0,0.3);
            background-color: #2c2c3a;
            z-index: 2;
        }

        .username-bar {
            background: rgba(0, 0, 0, 0.7);
            backdrop-filter: blur(12px);
            padding: 0.8rem 1.5rem 0.8rem 2rem;
            border-radius: 0 40px 40px 0;
            color: white;
            font-size: 1.3rem;
            font-weight: bold;
            letter-spacing: 0.5px;
            border: 1px solid rgba(255,255,255,0.25);
            border-left: none;
            margin-left: -12px;
            box-shadow: 0 5px 12px rgba(0,0,0,0.2);
            white-space: nowrap;
            max-width: 250px;
            overflow-x: auto;
            scrollbar-width: thin;
        }

        /* ردیف دو عکس دکمه‌ای - حالا درست بالای سه عکس پایینی */
        .top-row {
            position: fixed;
            bottom: 210px;       /* خیلی پایین‌تر، نزدیک به سه عکس پایینی */
            left: 0;
            right: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            gap: 60px;
            z-index: 200;
            direction: rtl;
        }

        .top-btn {
            cursor: pointer;
            transition: transform 0.2s ease;
            background: transparent;
            border: none;
            padding: 0;
            margin: 0;
            outline: none;
        }

        .top-btn img {
            max-width: 320px;
            max-height: 320px;
            width: auto;
            height: auto;
            object-fit: contain;
            filter: drop-shadow(0 10px 25px rgba(0,0,0,0.6));
            pointer-events: none;
        }

        .top-btn:active {
            transform: scale(0.94);
        }

        /* سه عکس پایین با کادر ظریف */
        .bottom-group {
            position: fixed;
            bottom: 20px;
            left: 0;
            right: 0;
            display: flex;
            justify-content: center;
            z-index: 200;
            direction: rtl;
        }

        .bottom-images {
            display: flex;
            justify-content: center;
            align-items: flex-end;
            gap: 0;
            background: rgba(255, 255, 255, 0.15);
            backdrop-filter: blur(8px);
            border-radius: 30px;
            padding: 8px 12px;
            border: 1px solid rgba(255, 255, 255, 0.4);
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
        }

        .bottom-btn {
            cursor: pointer;
            transition: transform 0.2s ease;
            background: transparent;
            border: none;
            padding: 0;
            margin: 0;
            outline: none;
            display: inline-block;
        }

        .bottom-btn img {
            max-width: 170px;
            max-height: 170px;
            object-fit: contain;
            display: block;
            pointer-events: none;
            filter: drop-shadow(0 4px 8px rgba(0,0,0,0.3));
        }

        .bottom-btn:active {
            transform: scale(0.95);
        }

        /* پیام به زودی */
        .toast-soon {
            position: fixed;
            bottom: 300px;
            left: 50%;
            transform: translateX(-50%);
            background: #ff5722ee;
            color: white;
            padding: 14px 36px;
            border-radius: 80px;
            font-weight: bold;
            font-size: 1.6rem;
            z-index: 1000;
            backdrop-filter: blur(12px);
            animation: fadeOutUp 1.2s forwards;
            pointer-events: none;
            white-space: nowrap;
            font-family: inherit;
            box-shadow: 0 8px 20px rgba(0,0,0,0.4);
        }

        @keyframes fadeOutUp {
            0% { opacity: 1; transform: translateX(-50%) translateY(0); }
            70% { opacity: 1; }
            100% { opacity: 0; transform: translateX(-50%) translateY(-50px); visibility: hidden; }
        }

        /* ریسپانسیو */
        @media (max-width: 900px) {
            .top-btn img { max-width: 240px; max-height: 240px; }
            .top-row { gap: 40px; bottom: 180px; }
            .currency-value { font-size: 1rem; }
            .currency-emoji { font-size: 1.4rem; }
            .top-bar { padding: 8px 18px; }
            .toast-soon { bottom: 270px; font-size: 1.3rem; }
        }

        @media (max-width: 700px) {
            .avatar { width: 65px; height: 65px; }
            .user-panel { top: 75px; }
            .username-bar { font-size: 1rem; padding: 0.5rem 1.2rem 0.5rem 1.6rem; max-width: 180px; }
            .top-btn img { max-width: 190px; max-height: 190px; }
            .bottom-btn img { max-width: 130px; max-height: 130px; }
            .top-row { gap: 30px; bottom: 160px; }
            .bottom-group { bottom: 15px; }
            .currency-value { font-size: 0.9rem; }
            .currency-emoji { font-size: 1.2rem; }
            .toast-soon { bottom: 250px; font-size: 1.1rem; padding: 10px 24px; }
        }

        @media (max-width: 550px) {
            .top-btn img { max-width: 150px; max-height: 150px; }
            .bottom-btn img { max-width: 105px; max-height: 105px; }
            .top-row { gap: 20px; bottom: 130px; }
            .toast-soon { font-size: 0.9rem; bottom: 210px; padding: 8px 18px; }
            .bottom-images { padding: 5px 8px; }
            .currency-item { padding: 4px 12px; }
        }

        .hidden {
            display: none;
        }
    </style>
</head>
<body>

<!-- مدال نام کاربری -->
<div id="usernameModal" class="modal">
    <div class="modal-content">
        <h2>🎮 انتخاب نام کاربری 🎮</h2>
        <input type="text" id="usernameInput" placeholder="نام خود را وارد کنید..." maxlength="20" autocomplete="off">
        <button id="saveNameBtn">ورود به بازی</button>
    </div>
</div>

<!-- نوار بالایی شفاف - جواهر در چپ، سکه در راست -->
<div class="top-bar">
    <div class="currency-item">
        <span class="currency-emoji">💎</span>
        <span class="currency-value" id="gemsValue">0</span>
    </div>
    <div class="currency-item">
        <span class="currency-emoji">🪙</span>
        <span class="currency-value" id="coinsValue">0</span>
    </div>
</div>

<!-- پنل کاربری -->
<div class="user-panel">
    <img class="avatar" id="userAvatar" src="https://cdn.imgurl.ir/uploads/z053125_SelfComic_Ninja1775502890071.jpg" alt="Avatar">
    <div class="username-bar" id="usernameDisplay">---</div>
</div>

<!-- ردیف دو عکس دکمه‌ای (حالا درست بالای سه عکس پایینی) -->
<div class="top-row">
    <div class="top-btn" id="topRightBtn">
        <img src="https://cdn.imgurl.ir/uploads/t03630_InShot__.png" alt="عکس بالایی راست">
    </div>
    <div class="top-btn" id="topLeftBtn">
        <img src="https://cdn.imgurl.ir/uploads/u338374_InShot__.png" alt="عکس بالایی چپ">
    </div>
</div>

<!-- گروه سه عکس پایین -->
<div class="bottom-group">
    <div class="bottom-images">
        <div class="bottom-btn" id="bottomRightImg">
            <img src="https://cdn.imgurl.ir/uploads/o580196_IMG_20260511_184033_171.jpg" alt="پایین راست">
        </div>
        <div class="bottom-btn" id="bottomCenterImg">
            <img src="https://cdn.imgurl.ir/uploads/d8154_IMG_20260511_184138_470.jpg" alt="پایین وسط">
        </div>
        <div class="bottom-btn" id="bottomLeftImg">
            <img src="https://cdn.imgurl.ir/uploads/b267514_IMG_20260511_184145_633.jpg" alt="پایین چپ">
        </div>
    </div>
</div>

<script>
    const modal = document.getElementById('usernameModal');
    const usernameInput = document.getElementById('usernameInput');
    const saveBtn = document.getElementById('saveNameBtn');
    const usernameDisplaySpan = document.getElementById('usernameDisplay');
    const avatarImg = document.getElementById('userAvatar');

    const gemsSpan = document.getElementById('gemsValue');
    const coinsSpan = document.getElementById('coinsValue');

    const topRight = document.getElementById('topRightBtn');
    const topLeft = document.getElementById('topLeftBtn');
    const bottomRight = document.getElementById('bottomRightImg');
    const bottomCenter = document.getElementById('bottomCenterImg');
    const bottomLeft = document.getElementById('bottomLeftImg');

    function loadCurrencies() {
        let gems = localStorage.getItem('userGems');
        let coins = localStorage.getItem('userCoins');
        if(gems === null) gems = 1250;
        if(coins === null) coins = 8300;
        gemsSpan.innerText = Number(gems).toLocaleString();
        coinsSpan.innerText = Number(coins).toLocaleString();
    }

    function showSoonToast() {
        const existingToast = document.querySelector('.toast-soon');
        if(existingToast) existingToast.remove();
        
        const toast = document.createElement('div');
        toast.className = 'toast-soon';
        toast.innerText = '⚡ به زودی... ⚡';
        document.body.appendChild(toast);
        
        setTimeout(() => {
            if(toast && toast.remove) toast.remove();
        }, 1300);
    }

    function loadUser() {
        const savedName = localStorage.getItem('gameUsername');
        if(savedName && savedName.trim() !== "") {
            usernameDisplaySpan.innerText = savedName;
            modal.classList.add('hidden');
        } else {
            modal.classList.remove('hidden');
            usernameInput.value = '';
            usernameInput.focus();
        }
    }

    function saveUsername() {
        let newName = usernameInput.value.trim();
        if(newName === "") {
            alert("لطفاً یک نام برای خود انتخاب کنید!");
            return;
        }
        if(newName.length > 20) newName = newName.slice(0,20);
        localStorage.setItem('gameUsername', newName);
        usernameDisplaySpan.innerText = newName;
        modal.classList.add('hidden');
    }

    saveBtn.addEventListener('click', saveUsername);
    usernameInput.addEventListener('keypress', (e) => {
        if(e.key === 'Enter') {
            e.preventDefault();
            saveUsername();
        }
    });

    if(topRight) topRight.addEventListener('click', showSoonToast);
    if(topLeft) topLeft.addEventListener('click', showSoonToast);
    if(bottomRight) bottomRight.addEventListener('click', showSoonToast);
    if(bottomCenter) bottomCenter.addEventListener('click', showSoonToast);
    if(bottomLeft) bottomLeft.addEventListener('click', showSoonToast);

    usernameDisplaySpan.addEventListener('dblclick', () => {
        modal.classList.remove('hidden');
        usernameInput.value = localStorage.getItem('gameUsername') || '';
        usernameInput.focus();
    });
    
    avatarImg.onerror = () => {
        console.warn("آواتار لود نشد");
        avatarImg.src = "https://via.placeholder.com/80?text=Avatar";
    };
    
    const allImages = document.querySelectorAll('img');
    allImages.forEach(img => {
        img.onerror = () => {
            console.warn("تصویر لود نشد:", img.src);
        };
    });
    
    loadUser();
    loadCurrencies();
    
    window.addEventListener('load', () => {
        if(localStorage.getItem('gameUsername')) modal.classList.add('hidden');
    });
</script>
</body>
</html>
